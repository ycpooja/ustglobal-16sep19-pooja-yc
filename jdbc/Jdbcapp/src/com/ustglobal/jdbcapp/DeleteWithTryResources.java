package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class DeleteWithTryResources {
public static void main(String[] args) {
	try{FileReader reader=new FileReader("text.properties");
		Properties prop=new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver-class-name"));
		String url=prop.getProperty("url");
		String sql=prop.getProperty("delete-query");
		try(Connection conn=DriverManager.getConnection(url,prop);
			PreparedStatement pstmt=conn.prepareStatement(sql)){
			String eid=args[0];
			int id=Integer.parseInt(eid);
			pstmt.setInt(1, id);
			
			int count=pstmt.executeUpdate();
			System.out.println(count+"row(s) deleted");
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

