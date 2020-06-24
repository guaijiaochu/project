<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- gt:大于，lt:小于，le:小于或等于，ge:大于或等于 -->
<c:if test="${a gt b }">a gt b</c:if>

<br>
<c:choose>
	<c:when test="{$a le b}">
	a le b
	</c:when>
	
	<c:otherwise>
	a gt b
	
	</c:otherwise>

</c:choose>
	
</body>
</html>