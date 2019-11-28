package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReadDemo {
public static void main(String[] args) {
	 EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 EntityManager entityManager=entityManagerFactory.createEntityManager();
	 Product product=entityManager.find(Product.class,2);
	 System.out.println("ID---"+product.getPid());
	 System.out.println("NAME--"+product.getPname());
	 System.out.println("QUANTITY---"+product.getQuantity());
	
}
}
