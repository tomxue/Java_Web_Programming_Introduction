package cn.itcast.chapter05.response;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PrintServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws     
       ServletException, IOException {
		String data="itcast";
		OutputStream out=response.getOutputStream();// 获取输出流对象
		out.write(data.getBytes());                     // 输出字符串信息
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
       ServletException, IOException {
		doGet(request,response);
	}
}