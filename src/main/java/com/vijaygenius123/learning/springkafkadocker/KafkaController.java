package com.vijaygenius123.learning.springkafkadocker;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    private final KafkaProducer producer;

    public KafkaController(KafkaProducer producer){
        this.producer = producer;
    }

    public void writeMessageToTopic(@RequestParam("message")String message){
        this.producer.writeMessage(message);
    }
}
