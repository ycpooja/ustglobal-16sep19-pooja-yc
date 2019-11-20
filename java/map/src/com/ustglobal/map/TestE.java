package com.ustglobal.map;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestE {
	public static void main(String[] args) {
		LinkedHashMap<String,Integer> lh=new LinkedHashMap<String,Integer>();
		lh.put("bangalore", 560068);
		lh.put("hariyana", 134203);
		lh.put("patna", 880000);
		System.out.println("data is"+lh);

		Set<String> s=lh.keySet();
		for (String string : s) 
		{
			System.out.println("key "+string);
		}
		System.out.println("===================");
		
		Collection<Integer> c=lh.values();
		for (Integer integer : c) {
			System.out.println("value "+integer);
		}
		System.out.println("=====================");
			
		
	}
}
