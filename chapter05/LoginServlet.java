package cn.itcast.chapter05.response; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		// ��HttpServletRequest�����getParameter()������ȡ�û���������
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// �����û���������ֱ�Ϊ��itcast��123
		if (("itcast").equals(username) &&("123").equals(password)) {
			// ����û�����������ȷ���ض��� welcome.html
                        response.sendRedirect("/chapter05/welcome.html");
		} else {
			// ����û�������������ض���login.html
			response.sendRedirect("/chapter05/login.html");
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}