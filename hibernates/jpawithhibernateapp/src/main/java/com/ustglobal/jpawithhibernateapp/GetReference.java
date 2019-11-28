package com.ustglobal.jpawithhibernateapp;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.dto.Product;



public class GetReference {
	public static void main(String[] args) {

		EntityManager entityManager=null;
	
			EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			Product product=entityManager.getReference(Product.class, 4);//It gives entity not found exception
			//Product product=entityManager.find(Product.class, 4);//It gives null pointer exception
			System.out.println(product.getPid());
			System.out.println(product.getPname());
			System.out.println(product.getQuantity());
			entityManager.close();
		}
		
	}

