package com.ustglobal.empapp.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import com.ustglobal.empapp.dto.EmployeeBean;

public class EmployeeDAOImpl implements EmployeeDAO{
	public ArrayList<EmployeeBean> getAllEmployeeData(){
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			ArrayList<EmployeeBean> result=	new ArrayList<EmployeeBean>();		
			while(rs.next()){
				EmployeeBean bean=new EmployeeBean();
				int id=rs.getInt("id");
				bean.setId(id);
				String name=rs.getString("name");
				bean.setName(name);
				int sal=rs.getInt("sal");
				bean.setSal(sal);
				String gender=rs.getString("gender");
				bean.setGender(gender);
				result.add(bean);
			}
			return result;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}

		finally{
			try{
				if(conn!=null){
					conn.close();
				}if(stmt!=null){
					stmt.close();
				}if(rs!=null){
					rs.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	public EmployeeBean searchEmployeeData(int id){
		String url="jdbc:mysql://localhost:3306/ust_ty_db?user=root&password=root";
		String sql="select * from employee where id=?";
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url);
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,id);
			rs=pstmt.executeQuery();

			if(rs.next()){
				EmployeeBean bean=new EmployeeBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setSal(rs.getInt("sal"));
				bean.setGender(rs.getString("gender"));
				return bean;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}finally{
			try{
				if(conn!=null){
					conn.close();
				}if(pstmt!=null){
					pstmt.close();
				}if(rs!=null){
					rs.close();
				}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
		public EmployeeBean updateEmployeeData(int id,String name,int sal,String gender) {
			try{FileReader reader=new FileReader("text.properties");
			Properties prop=new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driver-class-name"));
			String url=prop.getProperty("url");
			String sql=prop.getProperty("update-query");
			try(Connection conn=DriverManager.getConnection(url, prop);
				PreparedStatement pstmt=conn.prepareStatement(sql)){
				pstmt.setInt(4, id);
				pstmt.setString(1, name);
				pstmt.setInt(2, sal);
				pstmt.setString(3, gender);
			int count=pstmt.executeUpdate();
				if(count>0){
				System.out.println(count+"row(s) updated");
				}		
				}		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return null;
		
		}
	public int deleteEmployeeData(int id){
		try{FileReader reader=new FileReader("text.properties");
		Properties prop=new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver-class-name"));
		String url=prop.getProperty("url");
		String sql=prop.getProperty("delete-query");
		try(Connection conn=DriverManager.getConnection(url,prop);
			PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setInt(1, id);
			int count=pstmt.executeUpdate();
			if(count>0){
			System.out.println(count+"row(s) deleted");
			}
		}
	}
		catch(Exception e){
			e.printStackTrace();
		}
		return id;
	}

	public EmployeeBean insertEmployeeData(int id,String name,int sal,String gender) {
		try{FileReader reader=new FileReader("text.properties");
		Properties prop=new Properties();
		prop.load(reader);
		Class.forName(prop.getProperty("driver-class-name"));
		String url=prop.getProperty("url");
		String sql=prop.getProperty("insert-query");
		try(Connection conn=DriverManager.getConnection(url, prop);
			PreparedStatement pstmt=conn.prepareStatement(sql)){
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, sal);
			pstmt.setString(4, gender);
		int count=pstmt.executeUpdate();
			if(count>0){
				EmployeeBean bean1=new EmployeeBean();
				System.out.println(count+"row(s) inserted");
			}
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		return null;
	}		
	}
