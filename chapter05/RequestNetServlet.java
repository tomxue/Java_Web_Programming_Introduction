package cn.itcast.chapter05.request; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestNetServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html ;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("getRemoteAddr : " + request.getRemoteAddr() + "<br>");
		out.println("getRemoteHost : " + request.getRemoteHost() + "<br>");
		out.println("getRemotePort : " + request.getRemotePort() + "<br>");
		out.println("getLocalAddr : " + request.getLocalAddr() + "<br>");
		out.println("getLocalName : " + request.getLocalName() + "<br>");
		out.println("getLocalPort : " + request.getLocalPort() + "<br>");
		out.println("getServerName : " + request.getServerName() + "<br>");
		out.println("getServerPort : " + request.getServerPort() + "<br>");
		out.println("getScheme : " + request.getScheme() + "<br>");
		out.println("getRequestURL : " + request.getRequestURL() + "<br>");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}