package com.example.demo;

import java.lang.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringFirstApplication {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext c = SpringApplication.run(SpringFirstApplication.class, args);
		
		Book1 b1 = c.getBean(Book1.class);
		b1.display();
		b1.setName("Force");
		b1.setPrice(250);
		
		
	}	
	

}

