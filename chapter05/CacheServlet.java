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
		out.println("本次响应的随机数为：" + Math.random());
		out.println("<form action='NotServlet'" + "method='POST'>" +
			"第一个参数：<input type='text' name='p1'><br>" +
			"第二个参数：<textarea name='p2'></textarea><br>" +
			"<input type='submit' value='提交'> " +
			"</form>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}