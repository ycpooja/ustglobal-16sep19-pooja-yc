package com.ustglobal.jdbcapp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithCSVFile {
public static void main(String[] args) {
	String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
	String sql="insert into employee values(?,?,?,?)";
	try(FileReader in=new FileReader("csv.txt");
		BufferedReader reader=new BufferedReader(in);
		Connection conn=DriverManager.getConnection(url);
		PreparedStatement pstmt=conn.prepareStatement(sql)){
			while(reader.ready()){
				String line=reader.readLine();
				String[] word=line.split(",");
				
				int id=Integer.parseInt(word[0]);
				String name=word[1];
				int sal=Integer.parseInt(word[2]);
				String gender=word[3];
				pstmt.setInt(1, id);
				pstmt.setString(2, name);
				pstmt.setInt(3, sal);
				pstmt.setString(4, gender);
				pstmt.addBatch();			
			}
			int[] count=pstmt.executeBatch();
			System.out.println(count.length + "rows inserted");
	}catch(Exception e){
		e.printStackTrace();
	}
 }
}
