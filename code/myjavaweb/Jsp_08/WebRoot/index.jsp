<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>11AA这是一个jsp页面</title>
</head>

<% 
pageContext.setAttribute("name", "李四");
 %>
 
 
 
<body>
	name =<c:out value="${name} "></c:out><br>
	sex =<c:out value="${sex}"></c:out><br>
	age =<c:out  value="${age}"></c:out><br>
	address =<c:out  value="${address}"/><br>
	
	name=${name }<br>
	
	
	something=${something }<br>
	something= <c:out value="${something}"></c:out><br>
	something= <c:out value="${something}" escapeXml="true"></c:out><br>
	something= <c:out value="${something}" escapeXml="false"></c:out><br>
	
	
	<br><br>
	id=${person.id }<br>
	name = ${person.name }<br>
	性别：${person.sex }<br>
</body>

</html>


