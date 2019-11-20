package com.ustglobal.exception.first;

public class BMS {
public static void main(String[] args) {
	System.out.println("main started");
	PNR p=new PNR();
	try{
		p.book();
		System.out.println("booking confirmed");
	}
	catch(ArithmeticException ae){
		System.out.println("booking failed");
	}
	System.out.println("program ended");
}
}
