package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestJ {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(23);
		al.add(26);
		al.add(5);
		al.add(12);
		al.add(4);
		al.add(24);
		
		List<Integer>l=al.stream().map(i->i+50).collect(Collectors.toList());
		for (Integer i1 : l) {
			System.out.println(i1);
		}
}
}