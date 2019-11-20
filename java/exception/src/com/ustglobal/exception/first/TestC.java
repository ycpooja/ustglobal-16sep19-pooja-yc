package com.ustglobal.exception.first;

public class TestC {
	public static void main(String[] args) {

		System.out.println("program started");
		int a=10;
		int p[]={10,20,30};
		int b=10;
		try{
			System.out.println(p[5]);
			System.out.println(b/2);
			System.out.println("hello");
			System.out.println("happy deepavali");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("number is divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("array index not present");	
		}
		System.out.println(b);
		System.out.println("main ended");
	}
}


