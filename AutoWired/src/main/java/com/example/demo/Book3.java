package com.example.demo;

import org.springframework.stereotype.Component;

@Component("fix")
public class Book3 {

	public String name;
	public int price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void show() {
		System.out.println("hello mf fook**");
	}
	
	
}
