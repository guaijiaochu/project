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

<br>
<c:choose>
	<c:when test="${not empty customers}">
		<c:forEach items="${customers }" var="c" varStatus="s">
		<c:if test="${s.index %2==0 }">
		id=${c.id },name=${c.name },sex=${c.sex}<br/>
		</c:if>
		
		<c:if test="${s.index %2!=0 }">
		<font color ="red">
		id=${c.id },name=${c.name },sex=${c.sex}<br/>
		</font>
		</c:if>
		
		</c:forEach>


	</c:when>
	
	<c:otherwise>
	没有顾客信息
	</c:otherwise>

</c:choose>
<br>
<c:forEach begin="5" end="20" step="2" var="i">
${i }<br>
</c:forEach>	
	
	
</body>
</html>