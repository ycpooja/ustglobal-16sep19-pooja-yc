package com.ustglobal.beanObject.bean;

public class Employee {
	private int id;
	private double salary;
	private String name;
	private String dept;
	private String designation;

	public void setId(int id){
		this.id=id;	
	}
	public int getId()
	{
		return id;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;
	}
	public double salary()
	{
		return salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
}
