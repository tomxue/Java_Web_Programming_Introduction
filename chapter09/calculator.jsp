<%@ page language="java" pageEncoding="GBK" import="java.util.Map"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>calculator</title>
	</head>
	<body>
		<jsp:useBean id="calculator"
			class="cn.itcast.chapter09.model1.domain.Calculator" />
		<jsp:setProperty property="*" name="calculator" />
		<%
			if (calculator.validate()) {
		%>
		<font color="green">运算结果: 
		<jsp:getProperty property="firstNum" name="calculator" />
		<jsp:getProperty property="operator" name="calculator" />
		<jsp:getProperty property="secondNum" name="calculator" />
		=<%=calculator.calculate()%></font>
		<%
			} else {
				Map<String, String> errors = calculator.getErrors();
				pageContext.setAttribute("errors", errors);
			}
		%>
		<form action="" method="post">
			第一个运算数：<input type="text" name="firstNum" /> 
			<font color="red">${errors.firstNum}</font> <br />
			运算符: <select name="operator" style="margin-left: 100px">
						<option value="+">+</option>
						<option value="-">-</option>
						<option value="*">*</option>
						<option value="/">/</option>
				    </select> <br /> 
			第二个运算数： <input type="text" name="secondNum" /> 
			<font color="red">${errors.secondNum}</font> <br /> 
			<input type="submit" value="计算" />
		</form>
	</body>
</html>