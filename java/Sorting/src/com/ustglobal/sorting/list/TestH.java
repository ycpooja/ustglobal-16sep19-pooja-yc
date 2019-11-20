package com.ustglobal.sorting.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class TestH {
public static void main(String[] args) {
	ArrayList<Marker> al=new ArrayList<>();
	al.add(new Marker(10.0,"reynolds","black"));
	al.add(new Marker(30.0,"cello","brown"));
	al.add(new Marker(20.0,"ball","green"));
	al.add(new Marker(60.0,"fusion","gray"));
	al.add(new Marker(50.0,"elkos","blue"));
	System.out.println("before sorting------------>");
	display(al);
	SortByPrice sb=new SortByPrice();
	SortByColor sc=new SortByColor();
	//Collections.sort(al, sb);
	Collections.sort(al,sc );
	System.out.println("after sorting-------------->");
	display(al);
}
static void display(ArrayList<Marker> al){
	Iterator<Marker> it=al.iterator();
	while(it.hasNext())
	{
		Marker m=it.next();
		System.out.println("price is"+m.price);
		System.out.println("color is"+m.color);
		System.out.println("brand is"+m.brand);
		System.out.println("-----------------------------");
	}
}
}
