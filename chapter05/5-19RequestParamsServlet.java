package cn.itcast.chapter05.request; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestParamsServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         request.setCharacterEncoding("gbk");
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		System.out.println("�û�����" + name);
		System.out.println("��   �룺" + password);
		String[] hobbys= request.getParameterValues("hobby");
         System.out.print("���ã�");
		for (int i = 0; i < hobbys.length; i++) {
			System.out.print(hobbys[i]+" ");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}