package com.ustglobal.beanObject.bean;

import java.util.Scanner;

public class TestB {
public static void main(String[] args) {
	System.out.println("enter the age");
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	System.out.println("age is "+age);
	System.out.println("enter the name");
	Scanner s=new Scanner(System.in);
	String name=s.nextLine();
	System.out.println("name is "+name);
	System.out.println("enter the clg name");
	Scanner sc1=new Scanner(System.in);
	String clg=sc1.next();
	System.out.println("clgname is "+clg);
	
	sc.close();
	s.close();
	sc1.close();
	
}
}
