package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Test1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Test1Application.class, args);
		
		Test t1 = context.getBean(Test.class);
		
		t1.show();
		
	}

}
