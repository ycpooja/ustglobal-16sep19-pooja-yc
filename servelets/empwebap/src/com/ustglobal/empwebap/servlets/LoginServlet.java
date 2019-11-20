package com.ustglobal.empwebap.servlets;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ustglobal.empwebap.dao.EmployeeDao;
import com.ustglobal.empwebap.dto.EmployeeInfo;
import com.ustglobal.empwebap.util.EmployeeDaoManager;

@WebServlet("/login")
public class LoginServlet extends HttpServlet{

	protected void doGet(HttpServletRequest req,HttpServletResponse resp) 
			throws ServletException, IOException {
	
		int id=Integer.parseInt(req.getParameter("id"));
		String password=req.getParameter("password");
		String rememberMe=req.getParameter("remember");
		
		if(rememberMe==null) {
			Cookie[] Cookies=req.getCookies();
			if(Cookies!=null) {
				for (Cookie cookie: Cookies) {
					if(cookie.getName().equals("alwaysRemember")) {
						cookie.setMaxAge(0);
						resp.addCookie(cookie);
					}
					
				}
			}
		}else {
			Cookie cookie=new Cookie("alwaysRemember", id+" ");
			resp.addCookie(cookie);
		}

		EmployeeDao dao=EmployeeDaoManager.getEmployeeDAO();
		EmployeeInfo info=dao.auth(id,password);

		if(info==null) {
			PrintWriter out=resp.getWriter();
			out.println("<html>");
			out.println("<h4 style='color:Red'>Invalid id or password</h4>");
			out.println("</html>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("/login.jsp");
			dispatcher.include(req,resp);
		
		}else {
			HttpSession session=req.getSession(true);
			session.setAttribute("info",info);
			RequestDispatcher dispatcher=req.getRequestDispatcher("/home.jsp");
			dispatcher.forward(req,resp);

		}


	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}