package cn.itcast.chapter04.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet02 extends HttpServlet {
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
         // ���ServletConfig����
		ServletConfig config = this.getServletConfig();
		// ��ò�����Ϊencoding��Ӧ�Ĳ���ֵ
		String param = config.getInitParameter("encoding");
	     out.println("encoding="+param);
	}
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doGet(request, response);
	}
}