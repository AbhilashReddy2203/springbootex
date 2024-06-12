package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExcelRController {
	@RequestMapping("/")
	public String find() {
		return "find";
	}
	
	@RequestMapping("/calculate")
	public String calculate(@RequestParam int num1,ModelMap map) {
		if(num1 % 2 == 0) {
			map.put("key1", "Even number");
		}else {
			map.put("key1", "Odd number");
		}
		
		return "display";
	}

}
