package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByColor implements Comparator<Marker> {

	
	public int compare(Marker m1, Marker m2) {
		String p=m1.color;
		String q=m2.color;
		return p.compareTo(q);
}}

