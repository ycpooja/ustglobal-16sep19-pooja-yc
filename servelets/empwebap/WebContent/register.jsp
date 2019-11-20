<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg1" class="java.lang.String" scope="request"></jsp:useBean>
<body>

<h4><%=msg1%></h4>
<fieldset width="50%" align="center">
<legend>REGISTER</legend>
<form action="./register" method="post">
<a href="./home">Home</a>
<table align="center">
<tr><td>ID:</td><td><input name="id" type="number"></td></tr>
<tr><td>NAME:</td><td><input name="name" type="text"></td></tr>
<tr><td>EMAIL:</td><td><input name="email" type="email"></td></tr>
<tr><td>PASSWORD:</td><td><input name="password" type="password"></td></tr>
<tr><td></td><td><input type="submit"></td></tr>
</table>
</form>
</fieldset>
</body>
</html>