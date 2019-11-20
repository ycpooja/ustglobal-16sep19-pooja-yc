package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Driver;


public class MyFirstJDBC {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			//step 1:load the Driver
			Driver driver=new Driver();
			DriverManager.registerDriver(driver);

			//step 2:get the connection 
			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn= DriverManager.getConnection(url,"root","root");

			//step 3:issue SQL query
			stmt=conn.createStatement();
			String sql="select * from employee ";
			rs=stmt.executeQuery(sql);
		
			//step 4:read the result
			while(rs.next()){
				int id=rs.getInt("id");
				String name=rs.getString("name");
				int sal=rs.getInt("sal");
				String gender=rs.getString("gender");
				System.out.println("id "+id);
				System.out.println("name "+name);
				System.out.println("sal "+sal);
				System.out.println("gender "+gender);
				System.out.println("*******************");
			}
		}catch(SQLException e){
			e.printStackTrace();
		}	
		//step 5:close all JDBC objects
		finally{
			try{
				if(conn!=null){
					conn.close();
				}
				if(stmt!=null){
					stmt.close();
				}
				if(rs!=null){
					rs.close();
				}
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
	}
}
