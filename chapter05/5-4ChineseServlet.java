package cn.itcast.chapter05.response;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ChineseServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String data="ÖÐ¹ú";
         response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(data);
	}
	public void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}
}