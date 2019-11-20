<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg" class="java.lang.String" scope="request"></jsp:useBean>
<% 
	String id="";
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			for (Cookie cookie : cookies) {
				if(cookie.getName().equals("alwaysRemember")) {
				id=cookie.getValue();
			}
			
		}
	}
%>
<body>
<h4><%=msg %></h4>
	<fieldset allign='center'>
		<legend>login</legend>
		<form action='./login.jsp' method='post'>
			<table align='center'>
				<tr>
					<td>Id:</td>
					<td><input type='number' name='id' value='<%=id%>'></td>
				</tr>
				<td>Password:</td>
				<td><input type='password' name='password'></td>
				</tr>
				<tr>
					<td><input type='checkbox' name='remember' value='checked'></td>
					<td>Remember Me!!</td>
				</tr>
				<tr>
					<td><input type='reset' value='Reset'></td>
					<td><input type='submit' value='Login'></td>
				</tr>
			</table>
		</form>
	</fieldset>
	<a href='./register1.html'>Register</a>
</body>
</html>