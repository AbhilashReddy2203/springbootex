package com.excelr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class firstcontroller {
	@RequestMapping("/first")
	public String first() {
		return "first";
	}
	@RequestMapping("/second")
	public String sec() {
		return "second";
	}

}
