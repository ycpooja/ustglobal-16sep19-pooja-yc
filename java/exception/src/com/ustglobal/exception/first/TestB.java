package com.ustglobal.exception.first;

public class TestB {
public static void main(String[] args) {
	System.out.println("program started");
	int a=10;
	int p[]={10,20,30};
	int b=10;
	try{
		System.out.println(p[2]);
		System.out.println(b/0);
		System.out.println("hello");
		System.out.println("happy deepavali");
		throw new ArrayIndexOutOfBoundsException();
	}catch(ArithmeticException | ArrayIndexOutOfBoundsException ae){
		System.out.println("number is divided by zero");
	}
	System.out.println(b);
	System.out.println("main ended");
}
}
