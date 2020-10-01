package com.vijaygenius123.learning.springkafkadocker;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    private static final String TOPIC = "my_topic";

    private KafkaTemplate<String, String> kafkaTemplate;

    private void writeMessage(String message){

        this.kafkaTemplate.send(TOPIC, message);
    }

}
