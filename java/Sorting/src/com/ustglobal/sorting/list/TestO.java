package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestO {
public static void main(String[] args) {
	TreeSet ts=new TreeSet();
	ts.add(34);
	ts.add(45);
	ts.add(12);
	ts.add(9);
	ts.add(39);
	
	System.out.println("*************using for loop***********");
	for (Object string : ts) {
		System.out.println(string);
}
	System.out.println("***************using iterator********");
	Iterator it=ts.iterator();
	while(it.hasNext())
	{
		Object o=it.next();
		System.out.println(o);
	}
}

}
