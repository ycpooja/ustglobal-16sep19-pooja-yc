package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestR {
public static void main(String[] args) {
	SortByName sa=new SortByName();
	TreeSet<Customer> hs=new TreeSet(sa);
	Customer c1=new Customer("radha", 11, 100000.00);
	Customer c2=new Customer("rukmini", 12, 200000.00);
	Customer c3=new Customer("raghu", 15, 300000.00);
	hs.add(c1);
	hs.add(c2);
	hs.add(c3);
	
	System.out.println("*************using iterator************");
	Iterator<Customer> it=hs.iterator();
	while(it.hasNext())
	{
		Customer e=it.next();
		System.out.println("id is "+e.id);
		System.out.println("name is "+e.name);
		System.out.println("salary is "+e.salary);
		System.out.println("---------------------");
	}
	
}


}
