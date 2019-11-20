package com.ustglobal.streams.list;

import java.util.ArrayList;

public class TestK {
public static void main(String[] args) {
	ArrayList<Student> al=new ArrayList<>();
	al.add(new Student(5,"vikram",56.89));
	al.add(new Student(3,"vijay",70.89));
	al.add(new Student(6,"anu",30.69));
	al.add(new Student(2,"kushal",66.89));
	al.add(new Student(1,"aishu",44.89));
	
	Helper h=new Helper();
	//h.displayAllStudent(al);
	//h.displayFailedStudents(al);
	//h.displayFailedStudents(al);
	h.displayTopperStudents(al);
	
}
}
