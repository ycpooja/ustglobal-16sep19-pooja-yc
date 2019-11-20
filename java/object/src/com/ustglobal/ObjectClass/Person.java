package com.ustglobal.ObjectClass;

public class Person {
int id;
String name;
public Person(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}

	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
