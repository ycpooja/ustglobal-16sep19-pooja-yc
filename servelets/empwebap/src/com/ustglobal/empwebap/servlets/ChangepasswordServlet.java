package com.ustglobal.empwebap.servlets;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebap.dao.EmployeeDao;
import com.ustglobal.empwebap.dto.EmployeeInfo;
import com.ustglobal.empwebap.util.EmployeeDaoManager;

public class ChangepasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	HttpSession session=req.getSession();
    	if(session==null) {
    RequestDispatcher dispatcher=req.getRequestDispatcher("/home");
    dispatcher.forward(req,resp);
    }
    else{
    	String msg1="password mot matching";
    	RequestDispatcher dispatcher=req.getRequestDispatcher("/search.jsp");
    	dispatcher.forward(req, resp);
    	
    	
    }
    
    
    }
}
