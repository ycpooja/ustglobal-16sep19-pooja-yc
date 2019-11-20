package com.ustglobal.beanObject.bean;

public class TestS {
public static void main(String[] args) {
	Student s=new Student();
	s.setId(12);
	s.setName("chandana");
	s.setRollno(123);
	
	Database db=new Database();
	db.receive(s);
	
	System.out.println("================================");
	
	Employee e=new Employee();
	e.setId(11);
	e.setName("poo");
	e.setSalary(100000.00);
	e.setDept("computer science");
	e.setDesignation("software engineer");
	

	Database2 db1=new Database2();
	db1.receive(e);
	
}
}
