package com.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@PropertySource("db.properties")
@Configuration
public class AppConfig {
	@Autowired
	private Environment env;

	@Bean
	public DriverManagerDataSource dsObj() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("dc"));
		ds.setUrl(env.getProperty("url"));
		ds.setUsername(env.getProperty("un"));
		ds.setPassword(env.getProperty("pwd"));
		return ds;
	}

	@Bean
	public JdbcTemplate jtObj() {
		JdbcTemplate jt = new JdbcTemplate();
		jt.setDataSource(dsObj());
		return jt;
	}
}