package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLQueryWithDelete {
	public static void main(String[] args) {
		
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	String jpql="delete from Product where pid=2";
	Query query=entityManager.createQuery(jpql);
	int res=query.executeUpdate();
	System.out.println(res);
	}
	catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}