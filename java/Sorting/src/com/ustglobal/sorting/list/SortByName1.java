package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByName1 implements Comparator<Customer>{

public int compare(Customer o1, Customer o2) {
	
	return o1.name.compareTo(o2.name);
}
}
