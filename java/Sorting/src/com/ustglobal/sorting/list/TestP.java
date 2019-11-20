package com.ustglobal.sorting.list;

import java.util.LinkedList;

public class TestP {
public static void main(String[] args) {
	LinkedList<Integer> ll=new LinkedList<>();
	ll.add(12);
	ll.add(34);
	ll.add(45);
	ll.add(67);
	ll.add(89);
	
	Integer peekElement=ll.peek();
	System.out.println("peek element"+peekElement);
	Integer peekFirstelement=ll.peekFirst();
	System.out.println("peek first element"+peekFirstelement);
	Integer peekLastElement=ll.peekLast();
	System.out.println("peek last element"+peekLastElement);
	System.out.println("after peek--------------->"+ll);
	
	System.out.println("=====================================");
	
	Integer pollElement1=ll.poll();
	System.out.println("poll element"+pollElement1);
	Integer pollFirstelement=ll.pollFirst();
	System.out.println("poll first element"+pollFirstelement);
	Integer pollLastElement=ll.pollLast();
	System.out.println("poll last element"+pollLastElement);
	System.out.println("after poll--------------->"+ll);
	System.out.println("-----------------------------");
	
	ll.push(21);
	System.out.println("after push-------->"+ll);
	Integer p=ll.pop();
	System.out.println("after pop-------->"+ll);
	
	
	
	
}
}
