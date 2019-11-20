package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class MyFirstJDBCWithProperties {

	public static void main(String[] args) {

		Connection conn=null;
		Statement stmt=null;
		//Statement qstmt=null;q
		ResultSet rs=null;
		FileReader reader=null;
		try{
			reader= new FileReader("text.properties");
			Properties prop=new Properties();
			prop.load(reader);

			//step 1:load the Driver
			Class.forName(prop.getProperty("driver-class-name"));

			//step 2:get the connection 
			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);

			//step 3:issue SQL query
			stmt=conn.createStatement();
			String sql=prop.getProperty("select-query");
			//String sql1=prop.getProperty("insert-query");
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
				/*qstmt=conn.createStatement();
				int count=qstmt.executeUpdate(sql1);
				System.out.println(count+ "Row(s) inserted");*/
			}
			
			
		}catch(Exception e){
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
				if(reader!=null){
					reader.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}

}
