<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
	<legend>Update Profile</legend>
	<form action="./update" method="post" style="margin-left:300px">
		<table>
		<tr>
			<td>Retailer_id:</td><td><input type="number" name="retailer_id"></td>
			</tr>
			<tr>
			<td>Name:</td><td><input type="text" name="name"></td>
			</tr>
			<tr>
			<td>Email:</td><td><input type="email" name="email"></td>
			</tr>
			<tr>
			<td>password:</td><td><input type="password" name="password"></td>
			</tr>
			
			<tr>
			<td><input type="reset" value="Reset"></td>
			<td><input type="submit" value="Update"></td> 
			</tr>
		</table>
	
	</form>
	<a href="./login">Login Here</a>
	</fieldset>
</body>
</html>