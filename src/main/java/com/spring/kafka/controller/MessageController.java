package com.spring.kafka.controller;


import com.spring.kafka.dto.MessageRequest;
import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class MessageController {

    private KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("/publish")
    public void publish(@RequestBody MessageRequest messageRequest){
        kafkaTemplate.send("shubham", messageRequest.getMessage());
    }
}
