package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TestF {
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("anupama");
		al.add("savitha");
		al.add("kavitha");
		al.add("sunitha");

		String name=al.get(0);
		System.out.println(name.toUpperCase());
		Iterator<String>li =al.iterator();
		while(li.hasNext())
		{
			String a=li.next();
			System.out.println(a);
		}
		System.out.println("=======================using list iterator===========");
		ListIterator<String> l=al.listIterator();
		while(l.hasNext())
		{
			String s=l.next();
			System.out.println(s);
		}
		System.out.println("=======================using for each=============");
		for (String string : al) {
			System.out.println(string);

		}


	}
}
