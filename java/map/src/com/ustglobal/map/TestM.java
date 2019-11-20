package com.ustglobal.map;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TestM {
public static void main(String[] args) {
	Employee e1=new Employee(1, "radha", 23);
	Employee e2=new Employee(7, "rukmini", 21);
	Employee e3=new Employee(5, "pooja", 26);
	Employee e4=new Employee(4, "chaitra", 28);
	Employee e5=new Employee(2, "nivu", 29);
	Employee e6=new Employee(9, "guru", 35);
	Employee e7=new Employee(4, "kshama", 33);
	Employee e8=new Employee(7, "rajath", 45);
	Employee e9=new Employee(6, "raghu", 54);
	
	ArrayList<Employee> al=new ArrayList<>();
	al.add(e1);
	al.add(e2);
	al.add(e3);
	ArrayList<Employee>al1=new ArrayList<>();
	al1.add(e4);
	al1.add(e5);
	al1.add(e6);
	ArrayList<Employee>al2=new ArrayList<>();
	al2.add(e4);
	al2.add(e5);
	al2.add(e6);
	HashMap<String, ArrayList<Employee>> hm=new HashMap<>();
	hm.put("manager", al);
	hm.put("manager1", al1);
	hm.put("manager2", al2);
	ArrayList<Employee> manager1=hm.get("manager1");
	Iterator<Employee> it=manager1.iterator();
	while(it.hasNext())
	{
		Employee e=it.next();
	
		System.out.println("id is"+e.eid);
		System.out.println("name is"+e.name);
		System.out.println("age is"+e.age);
		System.out.println("=====================");
	}
	
	
	
	
}
}
