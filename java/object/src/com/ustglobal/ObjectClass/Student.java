package com.ustglobal.ObjectClass;

public class Student {
int id;
String name;
double percentage;

public Student(int id, String name, double percentage) {
	super();
	this.id = id;
	this.name = name;
	this.percentage = percentage;
}


	public int hashCode() {
		// TODO Auto-generated method stub
		return id;
	}

void Display()
{
	System.out.println("name is"+name+"percentage is"+percentage);
}


public String toString() {
	return "Student [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
}
}
