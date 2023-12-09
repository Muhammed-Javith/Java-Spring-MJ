package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.Model;
import com.app.bean.Product;

@Configuration
public class AppConfig {
	@Bean
	public Model modObj() {
		Model m = new Model();
		m.setMid(10);
		return m;
	}

	@Bean
	public Product prodObj() {
		Product p = new Product();
		p.setPid(10);
		p.setMod(modObj());
		return p;
	}
}