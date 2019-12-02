package cn.itcast.chapter05.response; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class CacheServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8"); 
        response.setDateHeader("Expires",0);
        response.setHeader("Cache-Control","no-cache"); 
        response.setHeader("Pragma","no-cache");  
		PrintWriter out = response.getWriter();
		out.println("������Ӧ�������Ϊ��" + Math.random());
		out.println("<form action='NotServlet'" + "method='POST'>" +
			"��һ��������<input type='text' name='p1'><br>" +
			"�ڶ���������<textarea name='p2'></textarea><br>" +
			"<input type='submit' value='�ύ'> " +
			"</form>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}