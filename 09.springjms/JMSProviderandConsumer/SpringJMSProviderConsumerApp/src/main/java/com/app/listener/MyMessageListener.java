package com.app.listener;

import org.springframework.stereotype.Component;

import jakarta.jms.JMSException;
import jakarta.jms.Message;
import jakarta.jms.MessageListener;
import jakarta.jms.TextMessage;

@Component
public class MyMessageListener implements MessageListener {
	@Override
	public void onMessage(Message message) {
		TextMessage tm = (TextMessage) message;
		try {
			System.out.println(tm.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}
}