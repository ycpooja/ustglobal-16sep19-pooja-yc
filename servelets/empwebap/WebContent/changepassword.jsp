<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:useBean id="msg1" class="java.lang.String" scope="request"></jsp:useBean>
<body>
<a href="./home">HOME</a><br></br>
<a href="./logout">LOGOUT</a>
<h4><%=msg1%></h4>
<fieldset align="center">
<legend>CHANGE PASSWORD</legend>
<form action="./changepassword.jsp" method="post">
<table align="center">
<tr><td>NEW:</td><td><input name="new" type="password"></td></tr>
<tr><td>CONFIRM:</td><td><input name="confirm" type="password"></td></tr>
<tr><td></td><td><input name="change" type="submit"></td></tr>
</table>
</form>
</fieldset>
</body>
</html>
