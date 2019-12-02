<%@ page language="java" pageEncoding="GBK"
	import="cn.itcast.chapter08.javabean.Manager" import="java.util.Date" 
	import="java.text.SimpleDateFormat"%>
<html>
<body>
    <% 
        Date date = new Date();
        pageContext.setAttribute("date", date);
    %>    
	<jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
	<jsp:setProperty name="manager" property="birthday" value="${date }" />
	<%
		manager = (Manager) pageContext.getAttribute("manager");
		String formatDate = 
				new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").
				format(manager.getBirthday());
		out.write("birthday属性的值为:"+formatDate);
	%>
</body>
</html>