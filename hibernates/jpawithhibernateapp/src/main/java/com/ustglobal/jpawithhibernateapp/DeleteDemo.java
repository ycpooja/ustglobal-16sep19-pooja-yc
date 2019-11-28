package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;


public class DeleteDemo {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		Product product=entityManager.find(Product.class, 2);
		entityManager.remove(product);
		System.out.println("delete record");
		entityTransaction.commit();
	}catch (Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
	
}
}
