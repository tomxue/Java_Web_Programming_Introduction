<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<%
     HttpServletRequest req=(HttpServletRequest)pageContext.getRequest();
    String ip = request.getRemoteAddr();
     out.println("������IP��ַΪ��"+ip);      
 %>
</body>
</html>