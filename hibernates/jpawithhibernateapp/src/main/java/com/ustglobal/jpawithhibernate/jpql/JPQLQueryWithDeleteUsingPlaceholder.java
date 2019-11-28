package com.ustglobal.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JPQLQueryWithDeleteUsingPlaceholder {
public static void main(String[] args) {
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		String jpql="delete from Product where pid=:id";
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 3);
		int res=query.executeUpdate();
		System.out.println(res);
		entityTransaction.commit();
		
	}
	catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();
	}
	entityManager.close();
}
}
