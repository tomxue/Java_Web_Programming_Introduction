<%@ page language="java" pageEncoding="GBK"
	import="cn.itcast.chapter08.javabean.Manager"%>
<html>
<body>
	    <jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
	    <jsp:setProperty name="manager" property="*" />
	    <%
		    manager = (Manager) pageContext.getAttribute("manager");
		    out.write("bonus���Ե�ֵΪ:"+manager.getBonus()+"<br />");
		    out.write("company���Ե�ֵΪ:"+manager.getCompany());
	    %>
</body>
</html>