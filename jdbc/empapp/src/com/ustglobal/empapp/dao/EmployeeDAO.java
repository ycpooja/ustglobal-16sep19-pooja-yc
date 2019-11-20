package com.ustglobal.empapp.dao;

import java.util.ArrayList;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {
	public ArrayList<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public EmployeeBean insertEmployeeData(int id,String name,int sal,String gender);
	public EmployeeBean updateEmployeeData(int id,String name,int sal,String gender);
	public int deleteEmployeeData(int id);
	
	
}
