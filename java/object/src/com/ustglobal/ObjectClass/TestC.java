package com.ustglobal.ObjectClass;

public class TestC {
public static void main(String[] args) {
	Student s=new Student(11, "pooja", 85);
	System.out.println(s);
	int hashcode=s.hashCode();
	System.out.println(hashcode);
}
}
