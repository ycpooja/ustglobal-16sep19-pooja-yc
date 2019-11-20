package com.ustglobal.streams.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TestR {
public static void main(String[] args) {
	ArrayList<Employee> al=new ArrayList<Employee>();
	Employee e1=new Employee(1, "chaitra");
	Employee e2=new Employee(2, "pooja");
	Employee e3=new Employee(3, "niveditha");
	
	Comparator<Employee> cmp=(e5,e6)->{
		if(e5.id>e6.id){
			return 1;
		}else if(e5.id<e6.id){
			return -1;
		}else{
			return 0;
		}
	};
	
	List<Employee> l=al.stream().sorted(cmp).collect(Collectors.toList());
	Iterator<Employee> it=al.iterator();
	while(it.hasNext())
	{
		Employee e=it.next();
		System.out.println("id is"+e.id);
		System.out.println("name is"+e.name);
		System.out.println("====================");
	}
}
}
