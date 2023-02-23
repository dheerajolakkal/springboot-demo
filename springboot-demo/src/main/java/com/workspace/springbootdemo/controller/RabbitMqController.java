package com.workspace.springbootdemo.controller;

import com.workspace.springbootdemo.service.RabbitmqServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMqController {
    @Autowired
    RabbitmqServiceImpl rabbitmqService;

    @RequestMapping(value = "/queue/rabbitmq",method = RequestMethod.POST)
    public void pushToQueue(@RequestParam(value = "data") String data){
        rabbitmqService.send(data);
    }
}
