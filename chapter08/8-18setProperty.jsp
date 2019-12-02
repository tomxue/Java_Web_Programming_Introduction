<%@ page language="java" pageEncoding="GBK"
	import="cn.itcast.chapter08.javabean.Manager"%>
<html>
<body>
        <form action="">
              公司<input  type="text" name="corp">    <br/>
              奖金<input  type="text" name="reward"> <br/>  
              <input type="submit" value="提交">     
        </form>
	   <jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
	   <jsp:setProperty name="manager" property="company" param="corp" />
	   <jsp:setProperty name="manager" property="bonus" param="reward" />
	   <%
		    manager = (Manager) pageContext.getAttribute("manager");
		    out.write("bonus属性的值为:"+manager.getBonus()+"<br />");
		    out.write("company属性的值为:"+manager.getCompany());
	    %>
</body>
</html>