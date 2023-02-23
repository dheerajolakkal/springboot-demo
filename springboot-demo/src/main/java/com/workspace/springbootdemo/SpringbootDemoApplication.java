package com.workspace.springbootdemo;

import com.workspace.springbootdemo.controller.PingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(scanBasePackages = "org.springframework.amqp.rabbit.core")
@ComponentScan(basePackages = {"com.workspace.springbootdemo.controller","com.workspace.springbootdemo.service","com.workspace.springbootdemo.config","org.springframework.amqp.rabbit.core"})
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDemoApplication.class, args);
	}

}
