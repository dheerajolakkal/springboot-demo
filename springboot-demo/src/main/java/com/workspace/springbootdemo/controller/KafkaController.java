package com.workspace.springbootdemo.controller;

import com.sun.deploy.net.HttpRequest;
import com.workspace.springbootdemo.service.KafkaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    KafkaServiceImpl kafkaService;
    @RequestMapping(value = "/queue/kafka",method = RequestMethod.POST)
    public void pushQueue(@RequestParam(value = "data")String data){
            kafkaService.send(data);
    }
}
