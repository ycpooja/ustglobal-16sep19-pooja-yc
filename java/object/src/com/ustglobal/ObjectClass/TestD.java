package com.ustglobal.ObjectClass;

public class TestD {
	public static void main(String[] args) {
		
Car c=new Car(500000, "alto", "black");
System.out.println(c);
int HashCode=c.hashCode();
System.out.println(HashCode);
}
}