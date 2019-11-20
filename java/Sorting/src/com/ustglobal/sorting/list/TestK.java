package com.ustglobal.sorting.list;

import java.util.Collections;
import java.util.LinkedList;

public class TestK {
public static void main(String[] args) {
	LinkedList<Integer>l=new LinkedList<>();
	l.add(12);
	l.add(13);
	l.add(34);
	l.add(3);
	l.add(10);
	System.out.println("before sort"+l);
	Collections.sort(l);
	System.out.println("after sort"+l);
	Collections.reverse(l);
	System.out.println("after reverse"+l);
	Collections.shuffle(l);
	System.out.println("after shuffle"+l);
	
}
}
