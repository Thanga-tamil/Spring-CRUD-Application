package com.NeoVim.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NeoVimApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeoVimApplication.class, args);
		
		System.out.println("hello spring");
	}

}
