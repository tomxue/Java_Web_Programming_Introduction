package cn.itcast.firstapp.servlet;
import java.io.*;
import javax.servlet.*;
public class HelloWorldServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// �õ������PrinterWriter����,Servletʹ���������������Ӧ
		PrintWriter out = response.getWriter();
		// ʹ�������������ͻ��˷����ַ�����
		out.println("Hello World");
	}
}