package cn.itcast.chapter06.session.example02;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class LogoutServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         // ��Session�����е�User�����Ƴ�
		request.getSession().removeAttribute("user");
		response.sendRedirect("/chapter06/IndexServlet");
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}