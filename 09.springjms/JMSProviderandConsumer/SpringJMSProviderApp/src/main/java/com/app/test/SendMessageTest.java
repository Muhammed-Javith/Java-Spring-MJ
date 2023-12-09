package com.app.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import com.app.config.AppConfig;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.Session;

public class SendMessageTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(AppConfig.class);
		JmsTemplate jt = c.getBean(JmsTemplate.class);
		jt.send("my-test-spring", new MessageCreator() {
			@Override
			public Message createMessage(Session ses) throws JMSException {
				return ses.createTextMessage("SAMPLE ONE");
			}
		});
		c.close();
	}
}