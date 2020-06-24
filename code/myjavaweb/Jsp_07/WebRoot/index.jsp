<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<body>
<!-- 首先从request中查找customer对象，查找不到，将创建一个Customer对象 -->
<jsp:userBean id="customer" scope="request" class="cn.com.leader.Customer">
	<!-- 给customer对象的name属性赋值：张三 -->
	<jsp:setProperty name="customer" property="name"  value="张三"/>

</jsp:userBean>
<%=customer.doSomething() %>

</body>
</html>


