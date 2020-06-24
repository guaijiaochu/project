<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>11AA这是一个jsp页面</title>
</head>
<body>

<%
String s = "nihao ";
pageContext.setAttribute("v4", "pagecontext 对象11");

 %>
 <br>
 	s =<%="s" %> <br>
 	pageContext=<%=pageContext.getAttribute("v4") %><br>
	v1(request) = <%= request.getAttribute("v1")  %><br>
	v2(session) = <%= session.getAttribute("v2") %><br>
	v3(application)= <%= application.getAttribute("v3") %> <br>

</body>
</html>

