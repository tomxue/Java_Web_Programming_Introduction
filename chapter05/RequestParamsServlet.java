package cn.itcast.chapter05.request; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestParamsServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("�û���:" + name);
		System.out.println("��  ��:" + password);
         // ��ȡ������Ϊ��hobby����ֵ
		String[] hobbys = request.getParameterValues("hobby");
         System.out.print("����:");
		for (int i = 0; i < hobbys.length; i++) {
			System.out.println(hobbys[i]+" ");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}