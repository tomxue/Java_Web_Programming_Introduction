<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
     HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
    String ip = request.getRemoteAddr();
     out.println("本机的IP地址为："+ip);      
 %>
</body>
</html>