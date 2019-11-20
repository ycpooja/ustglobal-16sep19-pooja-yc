package com.ustglobal.collectionframework.list;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class TestG {
public static void main(String[] args) {
	LinkedList li=new LinkedList();
	li.add(12);
	li.add("pooja");
	li.add(34.5);
	li.add(true);
	li.add(null);
	System.out.println("======================using for loop============");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}
	System.out.println("=================using for each=============");
	for (Object object : li) {
		System.out.println(object);
	}
	System.out.println("===================using iterator===========");
	Iterator it=li.iterator();
	while(it.hasNext())
	{
		Object o=it.next();
		System.out.println(o);
	}
	System.out.println("====================using list iterator(forward)===========");
	ListIterator l=li.listIterator();
	while(l.hasNext())
	{
		Object o1=l.next();
		System.out.println(o1);
	}
	System.out.println("==================using list iterator(backward)============");
	while(l.hasPrevious())
	{
		Object o2=l.previous();
		System.out.println(o2);
	}
}
}
