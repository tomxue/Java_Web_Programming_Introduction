package cn.itcast.chapter06.session.example02;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class IndexServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
          // �����������
		response.setContentType("text/html;charset=utf-8");
         // �������߻�ȡ�����û���Ϣ��Session����
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		if (user == null) {
			response.getWriter().print(
					"����û�е�¼����<a href='/chapter06/Login.html'>��¼</a>");
		} else {
			response.getWriter().print("���ѵ�¼����ӭ�㣬" + user.getUsername() + "��");
			response.getWriter().print(
					"<a href='/chapter06/LogoutServlet'>�˳�</a>");
			// ����Cookie���Session�ı�ʶ��
			Cookie cookie = new Cookie("JSESSIONID", session.getId());
			cookie.setMaxAge(60 * 30);
			cookie.setPath("/chapter06");
			response.addCookie(cookie);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}