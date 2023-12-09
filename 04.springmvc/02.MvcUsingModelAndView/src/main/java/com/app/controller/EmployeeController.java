package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public ModelAndView showPage() {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("Home");
		return mav;
	}
}