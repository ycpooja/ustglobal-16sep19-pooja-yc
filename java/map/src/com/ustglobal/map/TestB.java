package com.ustglobal.map;

import java.util.HashMap;

public class TestB {
public static void main(String[] args) {
	HashMap hm=new HashMap();
	hm.put("kuku", 786767);
	hm.put("mala", 345674);
	hm.put("mala", null);
	hm.put("mala", null);
	hm.put("kuku", null);
	hm.put("sheela", 23543);
	hm.put(null, 768778);
	hm.put(null, 24145);
	System.out.println("data"+hm);
	hm.put("mala", 797888);
	System.out.println("after modify"+hm);
	hm.put("dimple", 797888);
	System.out.println("after dimple"+hm);
	Object phoneno=hm.get("sheela");
	System.out.println("value "+phoneno);
	Object phoneno1=hm.get("chaitra");
	System.out.println("value "+phoneno1);
	hm.remove("mala");
	System.out.println("after remove"+hm);
	
}
}
