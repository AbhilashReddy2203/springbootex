package com.excelR.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecondController {
	@RequestMapping("/Project1")
		public String project() {
			return "Project1";
	}
}
