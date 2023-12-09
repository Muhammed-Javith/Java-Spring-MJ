package com.app.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jtObj");
		String sql = "insert into emptabs values(?,?,?,?)";
		int count = jt.update(sql, 3, "Ashu", "Male", "UK");
		System.out.println("Data Inserted :: " + count);
	}

}
