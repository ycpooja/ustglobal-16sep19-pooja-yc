package com.ustglobal.empwebap.servlets;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebap.dao.EmployeeDao;
import com.ustglobal.empwebap.dto.EmployeeInfo;
import com.ustglobal.empwebap.util.EmployeeDaoManager;

@WebServlet("/search")
public class SearchServlet extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
HttpSession session=req.getSession();

if(session==null) {
RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
dispatcher.forward(req,resp);
}
else{
	int id=Integer.parseInt(req.getParameter("search"));
	EmployeeDao dao=EmployeeDaoManager.getEmployeeDAO();
	EmployeeInfo info=new EmployeeInfo();
	req.setAttribute("info", info);
	RequestDispatcher dispatcher=req.getRequestDispatcher("/search.jsp");
	dispatcher.forward(req, resp);
	
}
}
}