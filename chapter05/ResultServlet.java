package cn.itcast.chapter05.request; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class ResultServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();// 获取PrintWriter对象用于输出信息
         // 获取request请求对象中保存的数据
		String company = (String) request.getAttribute("company");
		if (company != null) {
			out.println("公司名称：" + company + "<br>");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}