<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("company", "�������ǲ��ͽ������޹�˾",
				pageContext.PAGE_SCOPE);
		Object name = pageContext.getAttribute("company",pageContext.PAGE_SCOPE);
		out.println("��˾����Ϊ��" + name);
	%>
</body>
</html>