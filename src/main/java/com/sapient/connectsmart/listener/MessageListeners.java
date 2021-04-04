package com.sapient.connectsmart.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sapient.connectsmart.components.producer.ConnectSmartKafkaProducer;

//@Component
//public class MessageListeners {
//
//	public ConnectSmartKafkaProducer producer;
//	
//	public String topicName;
//	
//	
//
//	@Autowired
//	public MessageListeners(ConnectSmartKafkaProducer tProducer, String topicName) {
//		this.producer = tProducer;
//	}
//
//	public void publishMessagesToKafkaTopic(Object message) {
//
//		producer.publishMessagesOnTopic(message);
//	}
//
//	public static void listenToKafkaConsumers() {
//
//	}
//
//}
