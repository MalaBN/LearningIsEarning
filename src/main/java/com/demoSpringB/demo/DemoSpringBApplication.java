package com.demoSpringB.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoSpringBApplication.class, args);
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
