package com.workspace.springbootdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaServiceImpl {
    @Autowired
    KafkaTemplate<String,String> kafkaTemplate;
    public void send(String data){
        kafkaTemplate.send("topic_name",data);// topic created using CLI
                                        // decides the partition in Round robin
    }
    @KafkaListener(topics = {"topic_name"},groupId = "group1")
    public void receive(String data){
        System.out.println("!----->kafka topic returned : "+data);
    }
}
