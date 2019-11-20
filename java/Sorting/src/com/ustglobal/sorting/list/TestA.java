package com.ustglobal.sorting.list;

//import java.awt.DisplayMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestA {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
	Student s1=new Student(13, "Ramya", 80);
	Student s2=new Student(15, "rakshitha", 90);
	Student s3=new Student(11, "shilpa", 65.5);
	Student s4=new Student(14, "divya", 75.5);
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	System.out.println("before sorting");
	displayStudentDetails(al);

	Collections.sort(al);
	System.out.println("after sorting");
	displayStudentDetails(al);
     
}
static void displayStudentDetails(ArrayList<Student> al){
	Iterator<Student> it=al.iterator();
	while(it.hasNext())
	{
		Student s=it.next();
		System.out.println("id is "+s.id);
		System.out.println("name is "+s.name);
		System.out.println("percentage is "+s.percentage);
		System.out.println("---------------------------");
		
		
	}
}
}
