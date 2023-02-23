package com.workspace.springbootdemo.service;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqServiceImpl {
    @Autowired
    RabbitTemplate rabbitTemplate;
    @Autowired
    @Qualifier("firstQueue")
    Queue queue;
    public void send(String data){
        rabbitTemplate.convertAndSend(queue.getName(),data);
    }
    @RabbitListener(queues="firstQueue")
    public void receive(String data){
        System.out.println("!----->POP from queue :"+data);
    }
}