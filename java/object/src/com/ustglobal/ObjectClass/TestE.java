package com.ustglobal.ObjectClass;

public class TestE {
public static void main(String[] args) {
	Cow c =new Cow(1,"gowri",500000);
	Cow c1 =new Cow(2,"ganga",50000);
	Cow c3 =new Cow(1,"gowri",500000);
	Cow c4=c3;
	boolean isEqual=c1.equals(c4);
	System.out.println(c.equals(c1));
	System.out.println(c1.equals(c3));
	System.out.println(c.equals(c3));
	System.out.println(isEqual);
	
	
}
}
