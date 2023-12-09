package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.bean.A;
import com.app.bean.B;
import com.app.bean.C;

@Configuration
public class AppConfig {
	@Bean
	public C cObj() {
		C c = new C();
		c.setId(10);
		return c;
	}

	@Bean
	public B bObj() {
		B b = new B();
		b.setOc(cObj());
		return b;
	}

	@Bean
	public A aObj() {
		A a = new A();
		a.setOb(bObj());
		return a;
	}
}