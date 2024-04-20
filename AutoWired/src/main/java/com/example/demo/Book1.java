package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book1{
	
	String name;
	int price;
	
	@Autowired
	@Qualifier("art")
	public Book2 b2;
	
	Book1(){
		
	}
	
	public Book2 getB2() {
		return b2;
	}

	public void setB2(Book2 b2) {
		this.b2 = b2;
	}



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
	
	public void display() {
		System.out.println("hello spring");
		b2.setName("Art of don't give fook! :)");
		b2.setPrice(253);
		b2.dis();
		
	}
	
	
}