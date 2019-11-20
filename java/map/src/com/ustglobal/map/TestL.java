package com.ustglobal.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestL {
public static void main(String[] args) {
	Student s1=new Student(2, "divya", 67.89);
	Student s2=new Student(5, "pooja",80.76);
	Student s3=new Student(6, "chaitra",85.76);
	Student s4=new Student(7, "nivu",76.06);
	Student s5=new Student(1, "rekha",35.96);
	Student s6=new Student(3, "nayana",79.53);
	Student s7=new Student(4, "nithya",90.54);
	Student s8=new Student(8, "anu",65.76);
	Student s9=new Student(9, "roopa",40.76);
	
	ArrayList<Student> al=new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	ArrayList<Student> al1=new ArrayList<>();
	al1.add(s4);
	al1.add(s5);
	al1.add(s6);
	ArrayList<Student> al2=new ArrayList<>();
	al2.add(s7);
	al2.add(s8);
	al2.add(s9);
	
	HashMap<String,ArrayList<Student>>hm=new HashMap<>();
	hm.put("first", al);
	hm.put("second", al1);
	hm.put("third", al2);
	ArrayList<Student> first=hm.get("second");
	Iterator<Student> it=first.iterator();
	while(it.hasNext()){
		Student s=it.next();
		System.out.println("id is"+s.id);
		System.out.println("name is"+s.name);
		System.out.println("percentage is"+s.percentage);
		System.out.println("===================================");
	}
	
	
	
	
}
}
