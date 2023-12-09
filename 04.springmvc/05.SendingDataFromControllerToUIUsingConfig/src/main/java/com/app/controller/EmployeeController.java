package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.Employee;

@Controller
	public class EmployeeController
	{

	@RequestMapping("/show")
	public ModelAndView showMsg() {
	ModelAndView mav = new ModelAndView();
	mav.setViewName("Home");
	Employee e = new Employee();
	e.setEmpId(10);
	e.setEmpName("Vicky Raj");
	e.setEmpSal(6.5);
	mav.addObject("emp" , e);
	return mav;
	}
}
