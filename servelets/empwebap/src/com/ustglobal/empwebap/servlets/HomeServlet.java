package com.ustglobal.empwebap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.fabric.Response;
import com.ustglobal.empwebap.dto.EmployeeInfo;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
			throws ServletException,IOException{
		
		HttpSession session=req.getSession(false);//it will check the session object valid or not
		if(session!=null) {
		RequestDispatcher dispatcher=req.getRequestDispatcher("/home.jsp");
		}else {
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.forward(req,resp);
		}
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse resp) 
			throws ServletException, IOException {
		doGet(req,resp);
	
}
}