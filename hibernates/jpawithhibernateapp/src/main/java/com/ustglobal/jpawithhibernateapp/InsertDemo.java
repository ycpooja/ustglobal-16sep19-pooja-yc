package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;

public class InsertDemo {
	public static void main(String[] args) {
		Product product=new Product();
		product.setPid(4);
		product.setPname("pen");
		product.setQuantity(100);
		product.setPid(5);
		product.setPname("paper");
		product.setQuantity(200);
		product.setPid(6);
		product.setPname("book");
		product.setQuantity(300);

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(product);
		System.out.println("record saved");
		entityTransaction.commit();
		entityManager.close();
	}
}
