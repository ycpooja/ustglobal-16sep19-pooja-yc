package com.ustglobal.jpawithhibernate.onetomanyormanytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Test {
public static void main(String[] args) {
	

	PencilBox pb=new PencilBox();
	pb.setBid(20);
	pb.setBname("absara");
	
	Pencil p=new Pencil();
	p.setPid(5);
	p.setColor("red");
	p.setPencilBox(pb);
	
	Pencil p1=new Pencil();
	p1.setPid(6);
	p1.setColor("blue");
	p1.setPencilBox(pb);
	
	EntityManager entityManager=null;
	EntityTransaction entityTransaction=null;
	
	try {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	entityManager=entityManagerFactory.createEntityManager();
	entityTransaction=entityManager.getTransaction();
	entityTransaction.begin();
    PencilBox b=entityManager.find(PencilBox.class,10);
	System.out.println(b.getPencil());
	entityManager.persist(p);
	entityManager.persist(p1);
	System.out.println("record inserted");
	entityTransaction.commit();
	
}catch(Exception e) {
	e.printStackTrace();
	entityTransaction.rollback();
}
	entityManager.close();
}
}
