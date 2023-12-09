package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.app.bean.Product;

@Configuration
@PropertySource({ "MyProp.properties" })
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean

	public Product pdtObj() {
		Product p = new Product();
		p.setpId(env.getProperty("id", Integer.class));
		p.setPname(env.getProperty("name"));
		return p;
	}
}
