<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page errorPage="execp.jsp"%>
<%
String strprice=request.getParameter("price");
double price=Double.parseDouble(strprice);
out.println("Total price="+price*3);
%>