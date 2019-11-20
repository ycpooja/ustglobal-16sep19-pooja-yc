package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class UpdateWithTryResources {
public static void main(String[] args) {
	try{FileReader reader=new FileReader("text.properties");
	Properties prop=new Properties();
	prop.load(reader);
	Class.forName(prop.getProperty("driver-class-name"));
	String url=prop.getProperty("url");
	String sql=prop.getProperty("insert-query");
	try(Connection conn=DriverManager.getConnection(url, prop);
		PreparedStatement pstmt=conn.prepareStatement(sql)){
		pstmt.setInt(1, Integer.parseInt(args[0]));

		String name=args[1];
		pstmt.setString(2, name);

		String salary=args[2];
		int sal=Integer.parseInt(salary);
		pstmt.setInt(3, sal);

		String gender=args[3];
		pstmt.setString(4, gender);

		int count=pstmt.executeUpdate();
		
		System.out.println(count+"row(s) updated");
	}
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
		
}
