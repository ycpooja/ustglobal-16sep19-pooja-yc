package com.ustglobal.map;

import java.util.HashMap;

public class TestC {
public static void main(String[] args) {
	HashMap hm=new HashMap<>();
	hm.put("kuku", 78687);
	hm.put("mala",786786);
	hm.put("sheela", 78678);
	
	HashMap hm1=new HashMap<>();
	hm1.put("deepu", 768768);
	hm1.put("riya",324324);
	hm1.put("kriti", 786889);
	
	boolean hasKey=hm.containsKey("mala");
	System.out.println("has key "+hasKey);
	
	boolean hasValue=hm.containsValue(78687);
	System.out.println("has value"+hasValue);
	
	hm.putAll(hm1);
	System.out.println("after put all"+hm);
	
	System.out.println("size "+hm.size());
	boolean isEmpty=hm.isEmpty();
	System.out.println("map is empty "+isEmpty);
	
	hm.clear();
	System.out.println("after clear"+hm);
}
}
