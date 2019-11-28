package com.ustglobal.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestManyToMany {
public static void main(String[] args) {
	

	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	Course c1=new Course();
	c1.setCid(80);
	c1.setCname("java");
	
	Course c2=new Course();
	c2.setCid(90);
	c2.setCname("sql");
	
	Course c3=new Course();
	c3.setCid(100);
	c3.setCname("jdbc");
	ArrayList<Course> al=new ArrayList<Course>();
	al.add(c1);
	al.add(c2);
	al.add(c3);
	Student s1=new Student();
	s1.setSid(7);
	s1.setSname("pooja");
	s1.setCourse(al);
	
	Student s2=new Student();
	s2.setSid(9);
	s2.setSname("raju");
	s2.setCourse(al);
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
	entityManager.persist(s1);
	entityManager.persist(s2);
	Course c=entityManager.find(Course.class, 60);
	System.out.println(c.getStudent());
	System.out.println("record inserted");
	entityTransaction.commit();
	}catch(Exception e) {
	e.printStackTrace();
	entityTransaction.rollback();
}
	entityManager.close();
}
}
