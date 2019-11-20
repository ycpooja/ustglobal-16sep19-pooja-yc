package com.ustglobal.ObjectClass;

public class TestB {
public static void main(String[] args) {
	Pen p =new Pen();
	int HashCode=p.hashCode();
	System.out.println("hashcode is "+HashCode);
	
	String s=p.toString();
	System.out.println(s);
}
}
