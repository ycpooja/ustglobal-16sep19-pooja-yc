package com.ustglobal.sorting.list;

import java.util.Iterator;
import java.util.PriorityQueue;

public class TestD {
public static void main(String[] args) {
	PriorityQueue<Integer> pq=new PriorityQueue<>();
	pq.add(12);
	pq.add(24);
	pq.add(56);
	pq.add(78);
	pq.add(75);
	System.out.println("Before poll"+pq);
	System.out.println("******************using iterator**************");
	Iterator<Integer> it=pq.iterator();
	while(it.hasNext())
	{
		System.out.println(pq.poll());
	}
	System.out.println("after poll"+pq);
}
}
