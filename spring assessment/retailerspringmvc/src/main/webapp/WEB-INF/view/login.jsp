<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%><%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>${msg}</h3>
	<fieldset>
		<legend>Login</legend>
		<form action="./login" method="post">
			<table>
				<tr>
					<td>Retailer_id:</td>
					<td><input type="number" name="retailer_id"></td>
				</tr>
				<tr>
					<td>Password:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="reset" name="reset"></td>
					<td><input type="submit" name="login"></td>
				</tr>

			</table>
		</form>
	</fieldset>
	<a href="./createprofile">click here to register</a>
</body>
</html>