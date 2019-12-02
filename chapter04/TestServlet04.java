package cn.itcast.chapter04.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet04 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletContext context = this.getServletContext();
         // ͨ��setAttribute()������������ֵ
		context.setAttribute("data", "this servlet save data");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}