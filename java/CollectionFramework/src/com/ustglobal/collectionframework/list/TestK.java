package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestK {
public static void main(String[] args) {
	ArrayList<Employee>al=new ArrayList<Employee>();
	Employee s1=new Employee(11, "sumukha", 250000);
	Employee s2=new Employee(12, "bhavana", 250000);
	Employee s3=new Employee(13, "gautam", 670000);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	for(int i=0;i<al.size();i++){
		Employee s=al.get(i);
		System.out.println("Id is "+s.id);
	System.out.println("name is "+s.name);
	System.out.println("salary is "+s.salary);
	}
	System.out.println("======== each===");
	for(Employee s:al){
		System.out.println(s);
	}
}

}
