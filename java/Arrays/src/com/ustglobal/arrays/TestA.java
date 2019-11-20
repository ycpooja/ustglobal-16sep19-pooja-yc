package com.ustglobal.arrays;
public class TestA {
public static void main(String[] args) {
	int nums[]=new int[5];
	nums[0]=20;
	nums[1]=20;
	nums[2]=30;
	nums[3]=40;
	nums[4]=50;
	for(int i=1;i<nums.length;i++){
		System.out.println(nums[i]);
	}
	System.out.println("======================");
	for (int i : nums) {
		System.out.println(i);
	}
	System.out.println("======================");
	
		char[] ch={'a','b','c','d'};
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
	
	System.out.println("===========================");
		boolean b[]={true,false,true,false,true};
		
			for(boolean j:b)
			{
			System.out.println(j);	
			}
		
		System.out.println("=============================");
		double d[]={10.0,20.0,30.0,40.0,50.0};
		
			for(double k:d){
				System.out.println(k);
			}
	
		System.out.println("===============================");
		String s[]={"apple","mango","banana","jackfruit"};
		for(String g:s)
		{
			System.out.println(g);
			
		}
}
}
