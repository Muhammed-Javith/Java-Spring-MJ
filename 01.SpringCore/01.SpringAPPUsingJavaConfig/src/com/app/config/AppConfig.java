package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Product;

@Configuration
public class AppConfig {
	@Bean
	public Product prodObj() {
		Product p = new Product();
		p.setPid(56);
		p.setPname("Pen");
		return p;
	}
}
