<%@ page language="java" pageEncoding="GBK"%>
<html>
<head>
<title>�û���Ϣ</title>
</head>
<body>
        <jsp:useBean id="user" class="cn.itcast.chapter08.javabean.User" />
        <jsp:setProperty name="user" property="*" />
        <jsp:setProperty name="user"  property="email" param="mail" />
        ����:<jsp:getProperty name="user" property="name" />  <br />
        �Ա�:<jsp:getProperty name="user" property="gender" /> <br />
        ѧ��:<jsp:getProperty name="user" property="education" /> <br />
        ����:<jsp:getProperty name="user" property="email" /> 
</body>
</html>