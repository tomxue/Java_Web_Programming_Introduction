package cn.itcast.chapter05.response; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RefreshServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         // 每隔3秒定时刷新当前页面
response.setHeader("Refresh","3");
	
		response.getWriter().println(new java.util.Date());// 输出当前时间
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}