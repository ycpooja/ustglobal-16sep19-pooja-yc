package com.ustglobal.ObjectClass;

public class TestF {
public static void main(String[] args) {
	Employee e1=new Employee(1, "chaitra", 200000);
	Employee e2=new Employee(2, "pooja", 300000);
	Employee e3=new Employee(1, "chaitra", 200000);
    Employee e4=e3;
    System.out.println(e1.equals(e2));
    System.out.println(e1.equals(e3));
    System.out.println(e3.equals(e4));
    System.out.println(e1);
    System.out.println(e2);
    System.out.println(e3);
    System.out.println(e4);
}
}
