package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;

public class ExecuteUpdateQuery {
public static void main(String[] args) {
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	try{
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		String url="jdbc:mysql://localhost:3306/ust_ty_db";
		conn=DriverManager.getConnection(url,"root","root");
		String sql="update employee set name='sparsha', sal=50000 ,gender='f' where id=6";
		stmt=conn.createStatement();
		int count=stmt.executeUpdate(sql);
		System.out.println(count+"row(s) updated");
	}
	catch(SQLException e){
		e.printStackTrace();
	}finally{
		try{
			if(conn!=null){
				conn.close();
			}if(stmt!=null){
				stmt.close();
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}
}
