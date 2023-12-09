package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
public class EmployeeController {
	@RequestMapping("/show")
	public ModelAndView show() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Register");
		return mav;
	}

	@RequestMapping("/reg")
	public ModelAndView Register(@ModelAttribute("employee") Employee emp) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("Register");
		mav.addObject("emp", emp);
		return mav;
	}
}
