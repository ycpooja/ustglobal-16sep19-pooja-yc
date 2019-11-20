package com.ustglobal.accessmodifier.pkg1;

import com.ustglobal.accessmodifier.pkg2.Demo;

public class Sample extends Demo {
	public static void main(String[] args) {
		
	
	 Demo d=new Demo();
	/*System.out.println(d.a);
	d.add();*/
	//default
	Sample s=new Sample();
	//default
	System.out.println(d.b);
	d.sub();
	//protected
	/*System.out.println(d.c);
	d.mul();*/
	//public
	System.out.println(d.name);
	d.div();

	}}
