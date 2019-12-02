package cn.itcast.chapter05.response;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PrintServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws     
       ServletException, IOException {
		String data="itcast";
		PrintWriter print=response.getWriter();
		print.write(data);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
       ServletException, IOException {
		doGet(request,response);
	}
}