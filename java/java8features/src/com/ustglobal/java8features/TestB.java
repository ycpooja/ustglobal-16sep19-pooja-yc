package com.ustglobal.java8features;

import java.util.function.Predicate;

public class TestB {
public static void main(String[] args) {
	
	Predicate<Student>p=(s)->{
		if(s.percentage>=35.00){
			return true;
		}else{
			return false;
		}
	};

	Student s=new Student(1, "anup", 45.6);
	boolean p1=p.test(s);
	System.out.println("result"+p1);
	
}
}
