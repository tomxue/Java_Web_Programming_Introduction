<%@ page language="java" pageEncoding="GBK"%>
<html>
<head>
      <title>ע����Ϣ</title>
</head>
<body>
       <form action="/chapter08/userInfo.jsp" method="post">
          ����:<input type="text" name="name" /> <br />
          �Ա�:<input type="radio" name="gender" value="man" checked="checked" />man
               <input type="radio" name="gender" value="woman" />woman   <br/>
          ѧ��:<select name="education">
                    <option value="select">��ѡ��</option>
                    <option value="high_school_student">high_school_student</option>
                    <option value="undergraduate">undergraduate</option>
                    <option value="graduate">graduate</option>
                    <option value="doctor">doctor</option>
                </select>  <br/>
          ����:<input type="text" name="mail" /> <br />
               <input type="submit" value="�ύ"/>
       </form>
</body>
</html>