package com.ustglobal.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class QueryUsingJPQL {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		String jpql="select pname from Product";
		Query query=entityManager.createQuery(jpql);
		List<String> list=query.getResultList();
          for (String string : list) {
			//System.out.println("pid is"+string.getPid());
			System.out.println(string);
			//System.out.println("quantity is"+product.getQuantity());
			System.out.println("=============================");
		}
		entityManager.close();
	}
}
