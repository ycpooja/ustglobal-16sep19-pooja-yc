package com.ustglobal.jdbcapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import com.mysql.jdbc.Driver;

public class InsertByUsingPlaceholder {
	public static void main(String[] args) {
		Connection conn=null;
		PreparedStatement pstmt=null;

		try{
			/*Driver driver=new Driver();
			DriverManager.registerDriver(driver);*/
			Class.forName("com.mysql.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/ust_ty_db";
			conn=DriverManager.getConnection(url,"root","root");

			String sql="insert into employee values(?,?,?,?)";
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
			System.out.println(count+"row(s) deleted");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}if(pstmt!=null){
					pstmt.close();			
				}
			}catch(SQLException e){
				e.printStackTrace();
			}
		}
	}
}

