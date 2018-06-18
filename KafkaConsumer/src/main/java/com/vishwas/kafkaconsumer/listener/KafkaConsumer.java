package com.vishwas.kafkaconsumer.listener;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.vishwas.kafkaconsumer.model.User;
@Service
public class KafkaConsumer {
	/*@KafkaListener(topics="test",groupId="group_id")
	public void consume(String message) {
		System.out.println("Consumed Message"+message);
	}*/
	
	@KafkaListener(topics="test",groupId="group_json", containerFactory ="userKafkaListenerFactory")
	public void consumeJson(User user) {
		System.out.println("Consumed Message"+user);
	}
}
