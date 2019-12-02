<%@ page language="java" pageEncoding="GBK"%>
<html>
<head>
      <title>注册信息</title>
</head>
<body>
       <form action="/chapter08/userInfo.jsp" method="post">
          姓名:<input type="text" name="name" /> <br />
          性别:<input type="radio" name="gender" value="man" checked="checked" />man
               <input type="radio" name="gender" value="woman" />woman   <br/>
          学历:<select name="education">
                    <option value="select">请选择</option>
                    <option value="high_school_student">high_school_student</option>
                    <option value="undergraduate">undergraduate</option>
                    <option value="graduate">graduate</option>
                    <option value="doctor">doctor</option>
                </select>  <br/>
          邮箱:<input type="text" name="mail" /> <br />
               <input type="submit" value="提交"/>
       </form>
</body>
</html>