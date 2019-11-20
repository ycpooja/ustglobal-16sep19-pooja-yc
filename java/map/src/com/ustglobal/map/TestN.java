package com.ustglobal.map;

import java.util.HashMap;
import java.util.Hashtable;

public class TestN {
public static void main(String[] args) {
	Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(100, "sonu");
	ht.put(25, "monu");
	ht.put(15, "roopa");
	ht.put(99, "monu");
	ht.put(101, "sriram");
	//ht.put(null, "john"); null pointer exception
	//ht.put(102, null); null pointer exception
	System.out.println("data is"+ht);
	/*
	HashMap ht=new HashMap<>();
	ht.put(101, "ajay");
	ht.put(102, "vijay");
	ht.put(100, "sonu");
	ht.put(99, "monu");
	ht.put(101, "sriram");
	System.out.println(ht);*/
	
}
}
