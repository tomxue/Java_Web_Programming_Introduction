package cn.itcast.chapter05.response;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PrintServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws     
       ServletException, IOException {
		String data="itcast";
		OutputStream out=response.getOutputStream();// ��ȡ���������
		out.write(data.getBytes());                     // ����ַ�����Ϣ
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws 
       ServletException, IOException {
		doGet(request,response);
	}
}