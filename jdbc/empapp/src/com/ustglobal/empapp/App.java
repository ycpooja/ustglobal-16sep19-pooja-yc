package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeFactory;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to get all employee data");
		System.out.println("press 2 to insert employee data");
		System.out.println("press 3 to update employee data");
		System.out.println("press 4 to delete employee data");
		System.out.println("press 5 to search single employee data");

		Scanner sc=new Scanner(System.in);
		int ch=sc.nextInt();
		switch(ch){
		case 1:EmployeeDAO dao=EmployeeFactory.getEmployeeDAO();
				List<EmployeeBean> result=dao.getAllEmployeeData();
				
				for(EmployeeBean bean:result){
					System.out.println("Id: "+bean.getId());
					System.out.println("Name: "+bean.getName());
					System.out.println("salary:"+bean.getSal());
					System.out.println("gender: "+bean.getGender());
				}
				break;
		case 2:EmployeeDAO dao2=EmployeeFactory.getEmployeeDAO();
		int id1=sc.nextInt();
		String name=sc.next();
		int sal=sc.nextInt();
		String gender=sc.next();
		EmployeeBean bean1=dao2.insertEmployeeData(id1,name,sal,gender);
		if(bean1!=null){
		dao2.insertEmployeeData(id1,name,sal,gender);					
		}
		break;
		case 3:
			EmployeeDAO dao4=EmployeeFactory.getEmployeeDAO();
			int id3=sc.nextInt();
			String name1=sc.next();
			int sal1=sc.nextInt();
			String gender1=sc.next();
			EmployeeBean bean4=dao4.updateEmployeeData(id3,name1,sal1,gender1);
			if(bean4!=null){
			dao4.updateEmployeeData(id3,name1,sal1,gender1);					
			}
			break;
		case 4:	EmployeeDAO dao3=EmployeeFactory.getEmployeeDAO();
		int id2=sc.nextInt();
		EmployeeBean bean2=dao3.searchEmployeeData(id2);
		if(bean2!=null){
		dao3.deleteEmployeeData(id2);					
		System.out.println("Id: "+bean2.getId());
		System.out.println("name:"+bean2.getName());
		System.out.println("salary:"+bean2.getSal());
		System.out.println("gender:"+bean2.getGender());
		System.out.println("successfully deleted");
		}
		break;
		case 5:EmployeeDAO dao1=EmployeeFactory.getEmployeeDAO();
				int id=sc.nextInt();
				EmployeeBean bean=dao1.searchEmployeeData(id);
				if(bean!=null){
				dao1.searchEmployeeData(id);
				System.out.println("Id: "+bean.getId());
				System.out.println("Name: "+bean.getName());
				System.out.println("salary:"+bean.getSal());
				System.out.println("gender: "+bean.getGender());
				}else{
					System.out.println("no data found");
				}
				break;
		}
	}
}