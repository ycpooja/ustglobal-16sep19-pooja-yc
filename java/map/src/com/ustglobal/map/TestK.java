package com.ustglobal.map;

import java.util.Map;
import java.util.TreeMap;

public class TestK {
public static void main(String[] args) {
	TreeMap<String, Integer>lh=new TreeMap<>();
	
	
	lh.put("hariyana", 134203);
	lh.put("patna", 880000);
	lh.put("bangalore", 560068);
	//lh.put(null, 768768);
	System.out.println(lh);
	
	for(Map.Entry<String, Integer> m:lh.entrySet()){
		String key=m.getKey();
		Integer value=m.getValue();
		System.out.println("key is"+key);
		System.out.println("value is"+value);
	
		System.out.println("======================");
	}
}
}
