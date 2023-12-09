package com.app.text;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.bean.Employee;
/* for stand alone application*/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.scan("com.app");
		ac.refresh();
		Employee e = ac.getBean("employee", Employee.class);
		System.out.println(e);
	}
}