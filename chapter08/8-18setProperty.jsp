<%@ page language="java" pageEncoding="GBK"
	import="cn.itcast.chapter08.javabean.Manager"%>
<html>
<body>
        <form action="">
              ��˾<input  type="text" name="corp">    <br/>
              ����<input  type="text" name="reward"> <br/>  
              <input type="submit" value="�ύ">     
        </form>
	   <jsp:useBean id="manager" class="cn.itcast.chapter08.javabean.Manager" />
	   <jsp:setProperty name="manager" property="company" param="corp" />
	   <jsp:setProperty name="manager" property="bonus" param="reward" />
	   <%
		    manager = (Manager) pageContext.getAttribute("manager");
		    out.write("bonus���Ե�ֵΪ:"+manager.getBonus()+"<br />");
		    out.write("company���Ե�ֵΪ:"+manager.getCompany());
	    %>
</body>
</html>