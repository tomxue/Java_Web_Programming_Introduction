package cn.itcast.chapter05.response; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RefreshServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         // ÿ��3�붨ʱˢ�µ�ǰҳ��
response.setHeader("Refresh","3");
	
		response.getWriter().println(new java.util.Date());// �����ǰʱ��
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}