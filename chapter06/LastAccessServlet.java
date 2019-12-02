package cn.itcast.chapter06.cookie.example;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class LastAccessServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// ָ��������������ݵı��뷽ʽUTF-8����ֹ��������
		response.setContentType("text/html;charset=utf-8");
		/*
		 * �趨һ�� cookie ��name : lastAccessTime
		 * ��ȡ�ͻ��˷���cookie ����û��ϴεķ���ʱ����ʾ
                 */
		String lastAccessTime = null;
                // ��ȡ���е�cookie��������Щcookie�����������
		Cookie[] cookies = request.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			if ("lastAccess".equals(cookies[i].getName())) {
				// ���cookie������ΪlastAccess,���ȡ��cookie��ֵ
				lastAccessTime = cookies[i].getValue();
				break;
			}
		}
		// �ж��Ƿ��������ΪlastAccess��cookie
		if (lastAccessTime == null) {
			response.getWriter().print("�����״η��ʱ�վ������");
		} else {
		     response.getWriter().print("���ϴεķ���ʱ���ǣ� " 
                           + lastAccessTime);
		}
		// ����cookie,����ǰʱ����Ϊcookie��ֵ���͸��ͻ���
		Cookie cookie = new Cookie("lastAccess",
				new Date().toLocaleString());
		// ���� cookie
		response.addCookie(cookie);
	}
   protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}