package com.app.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;

import jakarta.jms.ConnectionFactory;

@Configuration
public class AppConfig {
	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
		cf.setBrokerURL("tcp://localhost:61616");
		return cf;
	}

	@Bean
	public JmsTemplate jmsTemplate() {
		// code for queue
		//JmsTemplate jt = new JmsTemplate();
		//jt.setConnectionFactory(connectionFactory());
		//return jt;
		// code for topic
		JmsTemplate jt = new JmsTemplate();
		jt.setConnectionFactory(connectionFactory());
		jt.setPubSubDomain(true);
		// Jt.setPubSubDomain(Boolean.TRUE);
		return jt;
	}
}