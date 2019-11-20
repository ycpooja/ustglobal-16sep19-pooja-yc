package com.ustglobal.typecasting.reference;

public class TestA {
	public static void main(String[] args) {
		Pen p=new Marker();//up casting
		System.out.println(p.cost);
		p.write();
		//p.color();
		//System.out.println(p.size());
		Marker m=(Marker)p;//down casting
		m.color();
		m.write();
	}
}
