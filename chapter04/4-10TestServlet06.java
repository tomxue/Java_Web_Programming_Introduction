package cn.itcast.chapter04.servlet;
import java.io.*;
import java.util.Properties;
import javax.servlet.*;
import javax.servlet.http.*;
public class TestServlet06 extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
         ServletContext context = this.getServletContext();
		String path = context.getRealPath("/WEB-INF/classes/itcast.properties");
		FileInputStream in = new FileInputStream(path);
		Properties pros = new Properties();
		pros.load(in);
		out.println("Company=" + pros.getProperty("Company") + "<br>");
		out.println("Address=" + pros.getProperty("Address") + "<br>");	
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		this.doGet(request, response);
	}
  }