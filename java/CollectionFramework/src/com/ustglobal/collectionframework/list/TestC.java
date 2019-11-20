package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;

public class TestC {
	public static void main(String[] args) {


		ArrayList al= new ArrayList();
		al.add(12);
		al.add(22.5);
		al.add("chinnu");
		al.add(true);
		al.add("good morning");



		Iterator i=al.iterator();
		Object o1=i.next();
		System.out.println("obj1 "+o1);
		Object o2=i.next();
		System.out.println("obj2 "+o2);
		Object o3=i.next();
		System.out.println("obj3 "+o3);
		Object o4=i.next();
		System.out.println("obj4 "+o4);

		boolean b=i.hasNext();
		System.out.println("has next " +b);
		Object o5=i.next();
		System.out.println("obj5 "+o5);
		boolean b1=i.hasNext();
		System.out.println("has next " +b1);

		System.out.println("=========using for loop=========");
		for(int i1=0;i1<al.size();i1++)
		{
			Object o=al.get(i1);
			System.out.println(o);
		}
		ArrayList al1=new ArrayList<>();
		al1.add(12);
		al1.add(233.44);
		al1.add("momo");
		al1.add(false);
		System.out.println("====================using iterator=============");
		Iterator it1=al1.iterator();
		while(it1.hasNext())
		{
			Object o=it1.next();
			System.out.println(o);
		}
		System.out.println("================for loop===============");
		for(;it1.hasNext();)
		{
			Object o=it1.next();
			System.out.println(o);
		}


	}
}
