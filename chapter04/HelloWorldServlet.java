package cn.itcast.firstapp.servlet;
import java.io.*;
import javax.servlet.*;
public class HelloWorldServlet extends GenericServlet {
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		// 得到输出流PrinterWriter对象,Servlet使用输出流来产生响应
		PrintWriter out = response.getWriter();
		// 使用输出流对象向客户端发送字符数据
		out.println("Hello World");
	}
}