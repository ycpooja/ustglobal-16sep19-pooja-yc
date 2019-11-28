package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.ustglobal.springcore.config.ConfigurationClass1;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;

public class AnnotationBook {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass1.class);
	Book b=context.getBean(Book.class);
	System.out.println(b.getAuthor());
	System.out.println(b.getName());
	System.out.println(b.getPrice());
	System.out.println("******************************");
	
	
	
	
}
}
