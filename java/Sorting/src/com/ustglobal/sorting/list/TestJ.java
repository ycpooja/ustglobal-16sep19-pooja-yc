package com.ustglobal.sorting.list;

import java.util.HashSet;
import java.util.Iterator;

public class TestJ {
public static void main(String[] args) {
	HashSet<String> hs=new HashSet<>();
	hs.add("vijay");
	hs.add("ajay");
	hs.add("sujay");
	hs.add("enjoy");
	hs.add("vijay");
	
	System.out.println("*************using for loop***********");
	for (String string : hs) {
		System.out.println(string);
		
	}
	System.out.println("*****************using iterator************");
	Iterator<String> it=hs.iterator();
	while(it.hasNext())
	{
		String p=it.next();
		System.out.println(p);
	}
}
}
