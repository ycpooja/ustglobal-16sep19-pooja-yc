package com.ustglobal.collectionframework.list;

import java.util.ArrayList;
import java.util.List;

public class TestL {
public static void main(String[] args) {
	ArrayList<Double>al=new ArrayList<Double>();
	al.add(34.5);
	al.add(23.5);
	al.add(87.5);
	al.add(12.3);
	al.add(null);
	al.add(null);
	
	System.out.println(al);
	al.add(5, 70.5);
	System.out.println("after add in 5th index"+al);
	al.remove(0);
	System.out.println("after remove 0th index"+al);
	al.remove(null);
	System.out.println("after removing null"+al);
	Double val=al.get(4);
	System.out.println("object at 4th index"+al);
	al.set(2, 77.6);
	System.out.println("after replacing 2nd index"+al);
	al.clear();
	System.out.println("after clear method"+al);
	al.contains(54.6);
	
	List<Double> al1=new ArrayList<>();
	
	al1.add(12.3);
	al1.add(23.4);
	al1.add(34.5);
	al.addAll(al1);
	System.out.println("after add all"+al1);
	
	boolean contain=al.containsAll(al1);
	System.out.println("contains all of al1"+contain);
	System.out.println("before remove"+al1);
	boolean res=al.removeAll(al1);
	System.out.println("after remove "+res);

	
}
}
