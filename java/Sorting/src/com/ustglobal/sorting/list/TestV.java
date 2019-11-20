package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestV {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet();
	ts.add("roopa");
	ts.add("jaya");
	ts.add("sushma");
	ts.add("shilpa");
	ts.add("shilpa");
	ts.add("deepa");
	
	System.out.println("*************using for loop***********");
	for (String string : ts) {
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

