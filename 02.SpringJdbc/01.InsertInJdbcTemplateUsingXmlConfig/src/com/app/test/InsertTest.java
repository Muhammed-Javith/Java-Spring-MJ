package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class InsertTest {
	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) c.getBean("jtObj");
		String sql = "insert into student values(?,?,?)";
		int count = jt.update(sql, 217, "Hala", 49999);
// DriverManagerDataSource ds= null;
// ds.setDriverClassName(arg0);
// ds.setUrl(url);
// ds.setUsername(username);
// ds.setPassword(password);
		System.out.println("Student saved successfully :: " + count);
	}
}