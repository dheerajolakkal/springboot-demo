package com.workspace.springbootdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.amqp.core.Queue;

@Configuration
public class RabbitmqConfig {

    @Bean
    public Queue firstQueue(){
        return new Queue("firstQueue");
    }
}
