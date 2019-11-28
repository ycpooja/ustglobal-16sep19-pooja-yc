package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class UpdateDemo {
public static void main(String[] args) {
	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	 entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	Product product=entityManager.find(Product.class, 3);
	product.setPname("mobile");

	System.out.println("update record");
	entityTransaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
