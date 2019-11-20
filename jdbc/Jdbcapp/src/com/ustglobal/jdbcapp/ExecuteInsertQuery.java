package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteInsertQuery {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	try{
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	String url="jdbc:mysql://localhost:3306/ust_ty_db";
	conn=DriverManager.getConnection(url, "root", "root");
	String sql=" insert into employee  " + " values(8,'roopa',700000,'f') ";
	stmt=conn.createStatement();
	int count=stmt.executeUpdate(sql);
	System.out.println(count+ "Row(s) inserted");
	
	}catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
		if(conn!=null){
			conn.close();
		}
		if(stmt!=null){
			conn.close();
		}
	}catch(SQLException e){
		e.printStackTrace();
	}
}
}
}