package com.app.text;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		Employee e = ac.getBean("empObj", Employee.class);
		e.setEmpId(10);
		e.setEmpName("Vicky Raj");
		System.out.println(e);
	}
}