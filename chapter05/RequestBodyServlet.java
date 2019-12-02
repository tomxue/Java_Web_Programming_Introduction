package cn.itcast.chapter05.request;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestBodyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		InputStream in = request.getInputStream();// ��ȡ����������
		byte[] buffer = new byte[1024]; // ����1024���ֽڵ�����
		StringBuilder sb = new StringBuilder(); // ����StringBuilder����
		int len;
		// ѭ����ȡ�����е�����
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