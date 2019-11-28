package com.ustglobal.springcore.di;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Book {

	public String author;
	public String name;
	public int price;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
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
	@PostConstruct
	public void init() {
		System.out.println("init method excecuting from book");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy method excecuting from book");
	}
}
