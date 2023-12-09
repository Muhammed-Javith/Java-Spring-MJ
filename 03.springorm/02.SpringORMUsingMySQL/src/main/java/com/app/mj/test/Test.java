package com.app.mj.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.mj.model.Employee;
import com.app.mj.service.EmployeeService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		EmployeeService es = context.getBean("stDao",EmployeeService.class);

		// Create and save an employee
		Employee emp = new Employee();
		emp.setEmpId(123);
		emp.setEmpName("ABC");
		emp.setEmpSal(12736);
		es.saveEmployee(emp);
System.out.println(es);
		// Retrieve the employee by ID
		Employee retrievedEmployee = es.getEmployeeById(emp.getEmpId());
		System.out.println("Retrieved Employee: " + retrievedEmployee);
	}
}
