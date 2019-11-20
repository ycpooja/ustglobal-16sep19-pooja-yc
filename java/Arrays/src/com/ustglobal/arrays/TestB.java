package com.ustglobal.arrays;

public class TestB {
public static void main(String[] args) {
	int[] nums={10,20,30,40,50};
	String num1[]={"apple","mango","banana","jackfruit"};
	//System.out.println(nums[10]);
	receive(nums);
	receive(num1);
}
//how to pass as parameters
static void receive( int[] numbers){
	for (int i : numbers) {
		System.out.println(i);
	}
}
//return integer array
static int[] getArray1(){
	int[] values={20,30,40,50};
	return values;
}
static void receive( String[] numbers1){
	for (String j : numbers1) {
		System.out.println(j);
	}
}
static String[] getArray(){
	String[] values1={"apple","mango"};
	return values1;
}
}
