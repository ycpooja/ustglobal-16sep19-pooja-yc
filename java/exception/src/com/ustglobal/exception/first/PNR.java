package com.ustglobal.exception.first;

public class PNR {
void book()
{
	System.out.println("booking started");
	try{
		System.out.println(10/0);
		System.out.println("login");
		System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae){
		System.out.println("booking failed");
		throw ae;
	}
}
}
