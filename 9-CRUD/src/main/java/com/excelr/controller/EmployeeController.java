package com.excelr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.excelr.model.EmployeeModel;
import com.excelr.service.EmployeeService;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping("/")
	public String dashboard(ModelMap map) {
		map.put("employees", service.getAllEmployees());
		return "dashboard";
	}
	
	@RequestMapping("/add")
	public String add() {
		return "add";
	}
	
	@RequestMapping("/save")
	public String save(EmployeeModel employee) {
		String msg = service.saveRecord(employee);
		if(msg.equals("Success")) {
			return "redirect:/";
		}else {
			return "redirect:/add";
		}

	}
	
	@RequestMapping("/edit")
	public String editRecord(@RequestParam("eno") int eno,
								@RequestParam("ename") String ename,
								@RequestParam("esal") int esal,
								@RequestParam("eimage") String eimage,
								ModelMap model) {
		model.put("eno", eno);
		model.put("ename", ename);
		model.put("esal", esal);
		model.put("eimage", eimage);
		
		return "update";
	}
	
	@RequestMapping("/updateEmployee")
	public String updateEmployee(EmployeeModel model) {
		String res = service.saveRecord(model);
		if(res.equals("Success")) {
			return "redirect:/";
		}else {
			return "redirect:/update";
		}
	}
	
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		String str = service.deleteRecord(id);
		if(str.equals("Success")) {
			return "redirect:/";
		}else {
			return "Error";
		}
	}
	
}
