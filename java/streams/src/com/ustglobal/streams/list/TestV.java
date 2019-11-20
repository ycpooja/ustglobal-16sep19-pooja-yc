package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestV {
public static void main(String[] args) {
	ArrayList<Integer> marks=new ArrayList<>();
	marks.add(40);
	marks.add(43);
	marks.add(46);
	marks.add(45);
	marks.add(12);
	marks.add(4);
	marks.add(24);
	
	List<Integer> l=marks.stream().sorted().collect(Collectors.toList());
	Iterator<Integer> it=l.iterator();
	while(it.hasNext())
	{
		Integer i=it.next();
		System.out.println("sorted--------------->");
		System.out.println(i);
	}
}
}
