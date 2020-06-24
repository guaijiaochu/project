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
	List list = new ArrayList();
	//初始化一个list
	for(int i=0;i<10;i++){
	list.add("SomeDate值:"+i);
	} 
	
	//输出List内容到网页上
	for (int i=0;i<list.size();i++){
	String  s= (String) list.get(i);
	out.println("<font color='red'>"+s+"</font><br>");//out是什么玩意？[它是一个隐含对象！]
	}
 %>

</body>
</html>

