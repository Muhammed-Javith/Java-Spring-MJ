package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Employee;

@Configuration
public class AppConfig {
	@Bean
	public Employee empObj() {
		Employee p = new Employee();
		p.setEmpId(56);
		p.setEmpName("Pen");
		return p;
	}
}
