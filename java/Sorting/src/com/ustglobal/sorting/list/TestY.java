package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestY {
public static void main(String[] args) {
	ArrayList<Pen> al=new ArrayList<>();
	Pen p1=new Pen(10.00, "reynolds");
	Pen p2=new Pen(20.00, "fusion");
	Pen p3=new Pen(15.00, "cello");
	Pen p4=new Pen(20.00, "elkos");
	Pen p5=new Pen(25.00, "ball");
	al.add(p1);
	al.add(p2);
	al.add(p3);
	al.add(p4);
	al.add(p5);
	System.out.println("before sorting");
	displayStudentDetails(al);
	Collections.sort(al);
	System.out.println("after sorting");
	displayStudentDetails(al);

}

static void displayStudentDetails(ArrayList<Pen>al)
{
	Iterator<Pen> it=al.iterator();
	while(it.hasNext())
	{
		Pen p=it.next();
		System.out.println("price is"+p.price);
		System.out.println("brand is"+p.brand);
		System.out.println("-----------------");
	}
}
}
