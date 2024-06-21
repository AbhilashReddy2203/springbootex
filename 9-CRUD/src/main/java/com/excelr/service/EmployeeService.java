package com.excelr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelr.model.EmployeeModel;
import com.excelr.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepo repo;
	
	public String saveRecord(EmployeeModel employee) {
		repo.save(employee);
		return "Success";
	}
	
	public List<EmployeeModel> getAllEmployees(){
		return repo.findAll();
	}
	
	public String deleteRecord(int id) {
		repo.deleteById(id);
		return "Success";
	}
}
