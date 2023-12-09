package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.impl.IModel;
import com.app.impl.ModelImpl;
import com.app.impl.Product;

@Configuration
public class AppConfig {
	@Bean
	public IModel modObj() {
		ModelImpl m = new ModelImpl();
		return m;
	}

	@Bean
	public Product pObj() {
		Product p = new Product();
		p.setMod(modObj());
		return p;
	}
}