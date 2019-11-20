<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%--     
<%!
public void jspInit(){
	System.out.println("this is the init phase");
}
public void jspDestroy(){
	System.out.println("this is the destroy phase");
}
%> --%>
<%@include file="/index.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%
Date date=new Date();
m();
%>
<%!
public int i=10;
public void m(){
System.out.println(i);
}
%>
<body>
<h1 style="color:green;">date and time is<%=date%></h1>
<h3><%=i%></h3>
</body>
</html>