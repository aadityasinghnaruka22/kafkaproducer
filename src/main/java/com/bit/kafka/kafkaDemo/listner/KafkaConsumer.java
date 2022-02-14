package com.bit.kafka.kafkaDemo.listner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.bit.kafka.kafkaDemo.model.User;

@Service
public class KafkaConsumer {
//
//	@KafkaListener(topics= "TestTopic", groupId = "group_id")
//	public void consume(String message) {
//		System.out.println("consumed message"+message);
//	}
	
	
	@KafkaListener(topics="TestTopic", groupId="group_id", containerFactory = "kafkaListnerContainerFactory")
	public void consumeJson(User user) {
		System.out.println("consumed message:: " + user);
	}
}
