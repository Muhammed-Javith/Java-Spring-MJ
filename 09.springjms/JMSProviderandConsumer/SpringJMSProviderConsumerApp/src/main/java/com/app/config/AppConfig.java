package com.app.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.listener.DefaultMessageListenerContainer;
import org.springframework.jms.listener.MessageListenerContainer;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.MessageListener;

@Configuration
@EnableJms
@ComponentScan(basePackages = "com.app")
public class AppConfig {
	@Autowired
	private MessageListener messageListener;

	@Bean
	public ConnectionFactory connectionFactory() {
		ActiveMQConnectionFactory c = new ActiveMQConnectionFactory();
		c.setBrokerURL("tcp://localhost:61616");
		return c;
	}

	@Bean
	public MessageListenerContainer listenerContainer() {
		DefaultMessageListenerContainer m = new DefaultMessageListenerContainer();
		m.setConnectionFactory(connectionFactory());
		m.setDestinationName("my-test-spring");
		m.setMessageListener(messageListener);
		return m;
	}
}