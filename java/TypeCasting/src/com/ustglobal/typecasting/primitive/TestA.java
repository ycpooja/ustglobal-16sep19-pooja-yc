package com.ustglobal.typecasting.primitive;

public class TestA {
public static void main(String[] args) {
	byte a=10;
	int b=a;//implicit type casting
	System.out.println("b is "+b);
	int p=20;
	double q=p;
	System.out.println("q is "+q);
	
	//explicit type casting
	double x=90;
	int y=(int)x;
	System.out.println("y is "+y);
	byte z=(byte)x;
	System.out.println("z is "+z);
	char r=(char)x;
	System.out.println("r is "+r);
}
}
