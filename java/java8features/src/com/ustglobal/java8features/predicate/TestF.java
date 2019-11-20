package com.ustglobal.java8features.predicate;

import java.util.function.Consumer;

public class TestF {
public static void main(String[] args) {
	Consumer<Student>c=s->{
		System.out.println("id is"+s.id);
		System.out.println("name is"+s.name);
		System.out.println("percentage is"+s.percentage);
		
	};
	Student s=new Student(1, "rose", 90.00);
	c.accept(s);
}
}
