<%@ page language="java" pageEncoding="GBK"
	import="cn.itcast.chapter08.javabean.Manager"%>
<html>
<body>
	    <jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
	    <jsp:setProperty name="manager" property="bonus" />
	    <%
		    manager = (Manager) pageContext.getAttribute("manager");
		    out.write("bonus属性的值为:"+manager.getBonus());
	    %>
</body>
</html>