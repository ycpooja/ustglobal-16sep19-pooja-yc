package com.ustglobal.sorting.list;


import java.util.Iterator;
import java.util.LinkedHashSet;

public class TestS {
public static void main(String[] args) {
	LinkedHashSet<String> ls=new LinkedHashSet<>();
	ls.add("vijay");
	ls.add("ajay");
	ls.add("sujay");
	ls.add("enjoy");
	ls.add("vijay");
	ls.add(null);
	ls.add(null);
	
	System.out.println("*************using for loop***********");
	for (String string : ls) {
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
