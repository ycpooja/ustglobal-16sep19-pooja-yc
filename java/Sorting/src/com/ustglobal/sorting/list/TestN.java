package com.ustglobal.sorting.list;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class TestN {
public static void main(String[] args) {
	LinkedList<Laptop> ll1=new LinkedList<Laptop>();
	Laptop l1=new Laptop(25000.00, 4, "hp");
	Laptop l2=new Laptop(20000.00, 4, "samsung");
	Laptop l3=new Laptop(55000.00, 6, "lenovo");
	Laptop l4=new Laptop(35000.00, 4, "dell");
	Laptop l5=new Laptop(45000.00, 6, "HP");
	ll1.add(l1);
	ll1.add(l2);
	ll1.add(l3);
	ll1.add(l4);
	ll1.add(new Laptop(20000,2,"acer"));
	System.out.println("before sorting");
	displayLaptopDetails(ll1);
	Collections.sort(ll1);
	System.out.println("after sorting");
	displayLaptopDetails(ll1);

	
}
static void displayLaptopDetails(LinkedList<Laptop> l){
	Iterator<Laptop> it=l.iterator();
	while(it.hasNext())
	{
		Laptop l1=it.next();
		System.out.println("brand is"+l1.ram);
		System.out.println("price is"+l1.price);
		System.out.println("name is"+l1.name);
		System.out.println("-------------------");
	}
	
}
}
