<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	这是一个page scope变量：<%=pageContext.getAttribute("v4") %><br>
	这是一个request scope变量:<%=request.getAttribute("v1") %><br>
	这是一个session scope变量：<%=session.getAttribute("v2")%><br>
	这是一个application scope变量：<%=application.getAttribute("v3") %>
</body>
</html>