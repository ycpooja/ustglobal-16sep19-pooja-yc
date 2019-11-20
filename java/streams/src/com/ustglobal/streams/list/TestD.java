package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;

public class TestD {
public static void main(String[] args) {
	ArrayList<Integer> marks=new ArrayList<>();
	marks.add(40);
	marks.add(43);
	marks.add(46);
	marks.add(45);
	marks.add(12);
	marks.add(4);
	marks.add(24);
	
	Comparator<Integer> cmp=(m1,m2)->{
		if(m1>m2){
			return 1;
		}else if(m1<m2){
			return -1;
		}else{
			return 0;
		}
	};
	
	long noofFailedStudents=marks.stream().filter(i->i<40).count();
	System.out.println(noofFailedStudents);
	System.out.println("=============================================");
	Integer m1=marks.stream().min(cmp).get();
	System.out.println(m1);
	System.out.println("==============================================");
	Integer m2=marks.stream().max(cmp).get();
	System.out.println(m2);
	
}
}
