package cn.itcast.chapter04.servlet;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet05 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
     PrintWriter out = response.getWriter();
		ServletContext context = this.getServletContext();
                // ͨ��getAttribute()������ȡ����ֵ
		String data = (String) context.getAttribute("data");
		out.println(data);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
}