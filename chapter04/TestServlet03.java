package cn.itcast.chapter04.servlet;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet03 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          PrintWriter out = response.getWriter();
          // �õ�ServletContext����
		 ServletContext context = this.getServletContext();
		 // �õ��������г�ʼ����������Enumeration����
		 Enumeration<String> paramNames = context.getInitParameterNames();
		  // �������еĳ�ʼ�����������õ���Ӧ�Ĳ���ֵ����ӡ������̨
		 out.println("all the paramName and paramValue are following:");
		  // �������еĳ�ʼ�����������õ���Ӧ�Ĳ���ֵ����ӡ
		 while (paramNames.hasMoreElements()) {
			String name = paramNames.nextElement();
			String value = context.getInitParameter(name);
			out.println(name + ": " + value);
              out.println("<br>");
         }
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          this.doGet(request, response);
	}
}