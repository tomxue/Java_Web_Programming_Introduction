<%@ page language="java" pageEncoding="GBK"%>
<html>
<head>
<title>用户信息</title>
</head>
<body>
        <jsp:useBean id="user" class="cn.itcast.chapter08.javabean.User" />
        <jsp:setProperty name="user" property="*" />
        <jsp:setProperty name="user"  property="email" param="mail" />
        姓名:<jsp:getProperty name="user" property="name" />  <br />
        性别:<jsp:getProperty name="user" property="gender" /> <br />
        学历:<jsp:getProperty name="user" property="education" /> <br />
        邮箱:<jsp:getProperty name="user" property="email" /> 
</body>
</html>