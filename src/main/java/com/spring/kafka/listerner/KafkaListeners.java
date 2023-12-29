package com.spring.kafka.listerner;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics="shubham",
    groupId = "shubhamGroupId")
     void listener(String data){
        System.out.println("I'm listening this data : "+data +"😉");
    }
}
