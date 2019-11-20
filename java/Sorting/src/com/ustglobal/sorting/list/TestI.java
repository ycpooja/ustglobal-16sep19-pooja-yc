package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestI {
public static void main(String[] args) {
	SortByName sb=new SortByName();
	SortByMicr sm=new SortByMicr();
	SortByPincode sp=new SortByPincode();
	
	TreeSet<Bank> ts=new TreeSet<Bank>(sb);
	
	
	Bank b1=new Bank("hdfc",60876,6567568);
	Bank b2=new Bank("hsbc",96876,6565668);
	Bank b3=new Bank("sbi",65456,4323234);
	Bank b4=new Bank("canara",34232,989878);
	Bank b5=new Bank("citi",98997,4534234);
	Bank b6=new Bank("citi",98997,4534234);
	
	ts.add(b1);
	ts.add(b2);
	ts.add(b3);
	ts.add(b4);
	ts.add(b5);
	ts.add(b6);
	
	
	System.out.println("************using iterator**************");
	Iterator<Bank> it=ts.iterator();
	while(it.hasNext()){
		Bank b=it.next();
		System.out.println("name is"+b.name);
		System.out.println("micr is"+b.micr);
		System.out.println("pincode is"+b.pincode);
		System.out.println("---------------------");
	}
}
}
