package com.ustglobal.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ustglobal.jpawithhibernate.onetoone.Person;
import com.ustglobal.jpawithhibernate.onetoone.VoterCard;

public class TestOnetoone {
	public static void main(String[] args) {
		
		VoterCard vc=new VoterCard();
		vc.setVid(30);
		vc.setVname("raju");
		Person p=new Person();
		p.setPid(3);
		p.setPname("roopa");
		p.setVoterCard(vc);
		
		EntityManager entityManager=null;
		EntityTransaction entityTransaction=null;
		try {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		VoterCard vcard=entityManager.find(VoterCard.class,20);
		System.out.println(vcard.getPerson().getPid());
		entityManager.persist(p);
		System.out.println("record saved");
		entityTransaction.commit();
	}catch(Exception e) {
		e.printStackTrace();
		entityTransaction.rollback();

	}
		entityManager.close();
}
}
