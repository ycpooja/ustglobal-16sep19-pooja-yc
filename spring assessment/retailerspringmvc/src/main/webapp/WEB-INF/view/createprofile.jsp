<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
		<legend>Login</legend>
		<form action="./createprofile" method="post">
			<table>
				<!-- <tr>
					<td>Retailer_id:</td>
					<td><input type="number" name="retailer_id"></td>
				</tr> -->
				<tr>
					<td>NAME:</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>EMAIL:</td>
					<td><input type="email" name="email"></td>
				</tr>
				<tr>
					<td>PASSWORD:</td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td><input type="reset" name="reset"></td>
					<td><input type="submit" name="register"></td>
				</tr>

			</table>
		</form>
	</fieldset>
	<a href="./login">click here to login</a>
</body>
</html>