package com.excelR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThirdController {
	@RequestMapping("/Project2")
	public String display() {
		return "Project2";
	}

}
