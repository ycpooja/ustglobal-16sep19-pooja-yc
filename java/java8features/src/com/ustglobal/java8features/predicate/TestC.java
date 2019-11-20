package com.ustglobal.java8features.predicate;

import java.util.function.Predicate;

public class TestC {
public static void main(String[] args) {
	Predicate<Student>p=(s)->{
		if(s.percentage>=18){
			return true;
		}else
		{
			return false;
		}
	};
	Student s=new Student(1,"pooja",21.00);
	boolean b=p.test(s);
	System.out.println(b);
}
}
