<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("company", "北京传智播客教育有限公司",
				pageContext.PAGE_SCOPE);
		Object name = pageContext.getAttribute("company",pageContext.PAGE_SCOPE);
		out.println("公司名称为：" + name);
	%>
</body>
</html>