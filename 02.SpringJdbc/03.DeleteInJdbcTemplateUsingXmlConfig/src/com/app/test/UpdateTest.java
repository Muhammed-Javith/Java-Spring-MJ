package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class UpdateTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jtObj");
		String sql = "delete from student where sid=?";
		int count = jt.update(sql, 217);
		System.out.println("Student Updated Successfully :: "+count);

	}
}