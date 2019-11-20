package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestB {

public static void main(String[] args) {
	ArrayList al= new ArrayList();
	al.add(12);
	al.add(22.5);
	al.add("chinnu");
	al.add(true);
	al.add(null);
	al.add('A');
	
	for (Object object : al) {
		System.out.println(object);
	}
}
}
