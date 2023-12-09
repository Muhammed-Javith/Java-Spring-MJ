package com.app.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.app.Mapper.StudentRowMapper;
import com.app.bean.Student;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
		JdbcTemplate jt = (JdbcTemplate) ac.getBean("jtObj");
		String sql = "select * from student where sid<?";
		StudentRowMapper srm = new StudentRowMapper();
		List<Student> s = jt.query(sql, srm,119);
		System.out.println(s);

	}
}