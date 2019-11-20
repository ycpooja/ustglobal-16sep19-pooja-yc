package com.ustglobal.empwebap.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login.jsp")
public class LoginPageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		String id="";
		Cookie[] cookies=req.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
				id=cookie.getValue();
			}
			
		}
	}
	/*out.println("<html>");
	out.println("<fieldset allign='center'>");
	out.println("<legend>login</legend>");
	out.println("<form action='./login' method='post'>");
	out.println("<table align='center'>");
	out.println("<tr>");
	out.println("<td>Id:</td>");
	out.println("<td><input type='number' name='id' value='"+id+"'></td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>Name:</td>");
	out.println("<td><input type='text' name='name'></td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>Email:</td>");
	out.println("<td><input type='email' name='email' ></td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td>Password:</td>");
	out.println("<td><input type='password' name='password' ></td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td><input type='checkbox' name='remember' value='checked'></td>");
	out.println("<td>Remember Me!!</td>");
	out.println("</tr>");
	out.println("<tr>");
	out.println("<td><input type='reset' value='Reset'></td>");
	out.println("<td><input type='submit' value='Login'></td>");
	out.println("</tr>");
	out.println("</table>");
	out.println("</form>");
	out.println("</fieldset>");
	out.println("<a href='./register1.html'>Register</a>");
	out.println("</html>");*/

}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}
}
