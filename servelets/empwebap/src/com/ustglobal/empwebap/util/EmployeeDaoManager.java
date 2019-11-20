package com.ustglobal.empwebap.util;

import com.ustglobal.empwebap.dao.EmployeeDao;
import com.ustglobal.empwebap.dao.EmployeeDaoJdbcImpl;

public class EmployeeDaoManager {

	private EmployeeDaoManager() {
		
	}
	public static EmployeeDao getEmployeeDAO() {
		return new EmployeeDaoJdbcImpl();
	}
}
