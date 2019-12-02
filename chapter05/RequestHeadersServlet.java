package cn.itcast.chapter05.request; 
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestHeadersServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		Enumeration headerNames = request.getHeaderNames();// ��ȡ������Ϣ������ͷ�ֶ�
         // ʹ��ѭ��������������ͷ����ͨ��getHeader()������ȡһ��ָ�����Ƶ�ͷ�ֶ�
		while (headerNames.hasMoreElements()) { 
			String headerName = (String) headerNames.nextElement();
			out.print(headerName + " : " + request.getHeader(headerName)+ "<br>");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}