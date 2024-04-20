package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("art")
public class Book2{
	
	String name;
	int price;
	
	@Autowired
	@Qualifier("fix")
	public Book3 book3;
	
	Book2(){
		
	}

	public Book3 getBook3() {
		return book3;
	}

	public void setBook3(Book3 book3) {
		this.book3 = book3;
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
	
	public void dis() {
		System.out.println("hello java!"+ "\n" + this.name + "\n" + this.price);
		book3.show();
	}
	
	
}