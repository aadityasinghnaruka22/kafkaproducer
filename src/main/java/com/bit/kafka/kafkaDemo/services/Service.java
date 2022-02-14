package com.bit.kafka.kafkaDemo.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


//@PropertySource("classpath:application.properties")
@Component
public class Service {

	  @Value("${name}")
	  private String myValues;

	public String getName() {
		return myValues;
		
	}
	  
	  
	
}
