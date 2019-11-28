package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class ReAttaching {
public static void main(String[] args) {
	EntityManager entitymanager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entitymanager=entityManagerFactory.createEntityManager();
		entityTransaction=entitymanager.getTransaction();
		entityTransaction.begin();
		Product product=entitymanager.find(Product.class,3);
		boolean b=entitymanager.contains(product);
		System.out.println(b);
		entitymanager.detach(product);
		System.out.println(entitymanager.contains(product));
		Product product2=entitymanager.merge(product);
		product2.setPname("clock");
		//entitymanager.clear();//It will clear all the Persistant objects
		System.out.println("update record");
		entityTransaction.commit();
		
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entitymanager.close();
}
}
