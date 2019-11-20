package com.ustglobal.java8features.predicate;

import java.util.function.Supplier;

public class TestE {
public static void main(String[] args) {
	Supplier<Student>s=()->new Student(2,"ajay",65.00);
	Student s1=s.get();
	System.out.println("id is"+s1.id);
	System.out.println("name is"+s1.name);
	System.out.println("percentage is"+s1.percentage);
	
	Supplier<Integer>i=()->20;
	int val=i.get();
	System.out.println("value is"+val);
	
	Supplier<String>sp=()->"good morning";
	String val1=sp.get();
	System.out.println("value is"+val1);
	
}
}
