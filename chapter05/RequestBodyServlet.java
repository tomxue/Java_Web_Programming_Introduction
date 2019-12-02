package cn.itcast.chapter05.request;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestBodyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		InputStream in = request.getInputStream();// 获取输入流对象
		byte[] buffer = new byte[1024]; // 定义1024个字节的数组
		StringBuilder sb = new StringBuilder(); // 创建StringBuilder对象
		int len;
		// 循环读取数组中的数据
		while ((len = in.read(buffer)) != -1) {
			sb.append(new String(buffer, 0, len));
		}
		System.out.println(sb);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}