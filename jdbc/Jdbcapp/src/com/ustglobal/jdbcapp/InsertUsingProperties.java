package com.ustglobal.jdbcapp;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class InsertUsingProperties {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;
		FileReader reader=null;

		try{
			reader= new FileReader("text.properties");
			Properties prop=new Properties();
			prop.load(reader);
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			Class.forName(prop.getProperty("driver-class-name"));

			String url=prop.getProperty("url");
			conn=DriverManager.getConnection(url,prop);

			String sql=prop.getProperty("insert-query");
			pstmt=conn.prepareStatement(sql);

			pstmt.setInt(1, Integer.parseInt(args[0]));

			String name=args[1];
			pstmt.setString(2, name);

			String salary=args[2];
			int sal=Integer.parseInt(salary);
			pstmt.setInt(3, sal);

			String gender=args[3];
			pstmt.setString(4, gender);

			int count=pstmt.executeUpdate();
			System.out.println(count+"row(s) inserted");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}if(pstmt!=null){
					pstmt.close();			}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
		
	}
}
