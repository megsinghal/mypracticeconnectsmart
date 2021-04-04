package com.sapient.connectsmart.exceptions;

import java.util.logging.Logger;

//@SL4J
public class ConnectSmartKafkaConsumerException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 103458457L;
	
	private static Logger logInstance = Logger.getLogger("ApplicationLogs");
	
	
	public ConnectSmartKafkaConsumerException(String message)
	{
		logInstance.info(message);
	}

	
	public ConnectSmartKafkaConsumerException(String topicName, String message)
	{
		logInstance.info(message);
	}

}
