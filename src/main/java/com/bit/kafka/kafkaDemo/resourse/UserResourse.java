package com.bit.kafka.kafkaDemo.resourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bit.kafka.kafkaDemo.model.User;
import com.bit.kafka.kafkaDemo.services.Service;

@RestController
public class UserResourse {

	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	private  String topic="TestTopic";
	
	@Autowired
	private Service service;
	
	@GetMapping("/kafka/publish/{name}")
	public String post(@PathVariable String name) {
		
		kafkaTemplate.send(topic,new User("1", name, "123")); 
		return "produce successfully";
		
	}
	
	@GetMapping("/getname")
	public String getName() {
		
		return service.getName();
	}
}
