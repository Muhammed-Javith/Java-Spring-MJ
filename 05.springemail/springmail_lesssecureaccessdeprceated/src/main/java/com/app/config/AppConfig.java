package com.app.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration

@ComponentScan(basePackages = "com.app")
public class AppConfig {
//JavaMail Sender Impl
	@Bean
	public JavaMailSenderImpl mail() {
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		mail.setHost("smtp.gmail.com");
		mail.setPort(587);
		mail.setUsername("muhammedjavith.mj@gamil.com");// enter your emailId.
		mail.setPassword("Duamj@31");// enter ur password.
		mail.setJavaMailProperties(props());
		return mail;
	}

	private Properties props() {
		Properties p = new Properties();
		p.put("mail.smtp.auth", "true");
		p.put("mail.smtp.starttls.enable", "true");
		return p;
	}
}