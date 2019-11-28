package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;

import com.ustglobal.springcore.di.Book;

public class ConfigurationClass1 {

	@Bean(name="book")
	public Book getBook() {
		Book b=new Book();
		b.setAuthor("chaitra");
		b.setName("java");
		b.setPrice(100);
		return b;	
	}
	
	
		
		
	}

