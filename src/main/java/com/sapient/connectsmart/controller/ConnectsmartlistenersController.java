package com.sapient.connectsmart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sapient.connectsmart.components.producer.ConnectSmartKafkaProducer;
import com.sapient.connectsmart.entities.Order;

@RestController
@RequestMapping(value = "/orders")
public class ConnectsmartlistenersController {

//	MessageListeners listeners;

	@Autowired
	public ConnectSmartKafkaProducer producer;

//	String topicName;
//	
//	KafkaTemplate kafkaTemplate;
//	
//	KafkaProperties properties;
//	
	
	public ConnectsmartlistenersController(ConnectSmartKafkaProducer tProducer)
	{
		this.producer = tProducer;
	}

//	public ConnectsmartlistenersController(ConnectSmartKafkaProducer tProducer,
//			@Value("${connectsmartkafka.topic-name}") String tTopicName, KafkaTemplate template, KafkaProperties props) {
//		this.producer = tProducer;
//		this.topicName = tTopicName;
//		this.kafkaTemplate = template;
//		this.properties = props;
//	}

	@GetMapping("/id")
	public void publishMessagesOnTopicForId() {

		System.out.println("orders controller is hit ");
		Order tOrder = new Order();
		tOrder.setId("orderid1");
		tOrder.setStatus("Complete");

//		MessageListeners listeners = new MessageListeners(this.producer,this.topicName);
		
		producer.publishMessagesOnTopic(tOrder);
		
		
		
//		listeners.publishMessagesToKafkaTopic(tOrder);
	}

}
