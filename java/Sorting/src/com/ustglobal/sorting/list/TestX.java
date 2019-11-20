package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestX {
public static void main(String[] args) {
	LinkedHashSet<Double> ls=new LinkedHashSet<>();
	ls.add(12.3);
	ls.add(4.2);
	ls.add(7.8);
	ls.add(8.6);
	ls.add(7.5);
	
	System.out.println("*************using for loop***********");
	for (Double string : ls) {
		System.out.println(string);
}
	System.out.println("***************using iterator********");
	Iterator it=ls.iterator();
	while(it.hasNext())
	{
		Object o=it.next();
		System.out.println(o);
	}
	

}
}
