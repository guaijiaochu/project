<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>11AA这是一个jsp页面</title>
</head>
<body>

<%
	String s="世界，你好";
	pageContext.setAttribute("v4", "200");
 %><br>
 
	这是一个局部变量：s=<%="s" %><br>
	这是一个page scope变量：v4(pageContext)= <%=pageContext.getAttribute("v4") %><br>
	这是一个request scope变量:v1(request)= <%=request.getAttribute("v1") %><br>
	这是一个session scope变量：v2(session)= <%=session.getAttribute("v2")%><br>
	这是一个application scope变量：v3(application) <%=application.getAttribute("v3") %><br>
	
</body>
</html>

