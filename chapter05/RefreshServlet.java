package cn.itcast.chapter05.response; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RefreshServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         // 2秒后刷新并跳转到传智播客官网首页
         response.setHeader("Refresh","2;URL=http://www.itcast.cn");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}