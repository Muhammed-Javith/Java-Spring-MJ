package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeeController {
	@RequestMapping("/show")

	public String showPage(ModelMap map) {
		map.addAttribute("data", "Hello");
		return "Home";
	}
}