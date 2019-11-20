package com.ustglobal.collectionframework.list;

public class Employee
{
	int id;
	String name;
	double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary=salary;
	}
	
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

/*public int getId() {
	return id;
}
public String getName() {
	return name;
}
public double getPercentage() {
	return percentage;*/



}
