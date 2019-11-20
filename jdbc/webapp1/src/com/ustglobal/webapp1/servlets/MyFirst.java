package com.ustglobal.webapp1.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirst extends HttpServlet {
			@Override
			protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
			{
			Connection conn=null;
			PreparedStatement pstmt=null;
			ResultSet rs=null;
			try {
				String url="jdbc:mysql://localhost:3306/ust_ty_db";
				conn= DriverManager.getConnection(url,"root","root");
				pstmt=conn.prepareStatement("select * from employee where id=?");
				int id=Integer.parseInt(req.getParameter("id"));
				pstmt.setInt(1, id);
				rs=pstmt.executeQuery();
				PrintWriter out=resp.getWriter();
				out.println("<html>");
				out.println("<h1>Employees List</h1>");
				out.println("</html>");
					if(rs.next()){
						out.println("<html>");
						out.println("<table>");
						out.println("<tr>");
						out.println("<td>id</td>"+rs.getInt("id"));
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>name</td> "+rs.getString("name"));
						out.println("</tr>");
						out.println("<tr>");
						out.println("<td>sal</td>"+rs.getInt("sal"));
						out.println("</tr>");
						out.println("<td>");
						out.println("gender "+rs.getString("gender"));
						out.println("</td>");
						out.println("</tr>");
						out.println("</table>");
						out.println("</html>");
				}
		}catch(Exception ex) {
			ex.printStackTrace();
			
		}finally {
			try {
				if(conn!=null) {
					conn.close();
				}if(pstmt!=null) {
					pstmt.close();
				}if(rs!=null) {
					rs.close();
				}
			}catch(Exception ex) {
				ex.printStackTrace();
			}
		}		
	}
}