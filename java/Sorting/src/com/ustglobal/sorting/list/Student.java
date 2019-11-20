package com.ustglobal.sorting.list;

public class Student implements Comparable<Student> {
int id;
String name;
double percentage;
public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}

	public int compareTo(Student s) {
	if(this.id>s.id){
		return 1;
	}else if(this.id<s.id){
		return -1;
	}else{
		return 0;

	}
	}
/*
	public int compareTo(Student o) {
		if(this.percentage>o.percentage){
			return 1;
		}else if(this.percentage<o.percentage)
		{
			return -1;
		}else{
			return 0;
		}
}*/
/*
	public int compareTo(Student o) {
		String p=this.name;
		String q=o.name;
		return p.compareTo(q);
	}*/
}
