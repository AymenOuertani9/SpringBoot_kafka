package com.example.springbootkafkafirsttry;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListner {

    @KafkaListener(topics = "firstTryTopic" , groupId = "groudId")
    void listner(String data){
        System.out.println(data);
    }

}
