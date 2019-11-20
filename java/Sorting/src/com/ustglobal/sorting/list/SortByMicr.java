package com.ustglobal.sorting.list;

import java.util.Comparator;

public class SortByMicr implements Comparator<Bank> {


public int compare(Bank o1, Bank o2) {
	Long m=o1.micr;
	Long n=o2.micr;
	return m.compareTo(n);

}
	
	

}
