package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class TestA {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<>();
	al.add(20);
	al.add(23);
	al.add(26);
	al.add(5);
	al.add(12);
	al.add(4);
	al.add(24);
	List<Integer> l=al.stream().filter(i->i%3==0).collect(Collectors.toList());
	List<Integer> l2=al.stream().map(i->i*3).collect(Collectors.toList());
	for (Integer l1 : l) {

	System.out.println(l1);
	}
	System.out.println("==========================");
	for (Integer i1 : l2) {
		
	
	System.out.println(i1);
	}
	}
}

