<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<title>Insert title here</title>
<body>
	当前访问时间是：
	<%
	   out.print(new java.util.Date().toLocaleString());
%>
</body>
</html>