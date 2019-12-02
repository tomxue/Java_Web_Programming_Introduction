package cn.itcast.chapter05.request; 
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class DownManagerServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
         String referer = request.getHeader("referer");// ��ȡrefererͷ��ֵ
		String sitePart = "http://" + request.getServerName();// ��ȡ���ʵ�ַ
         // �ж�refererͷ�Ƿ�Ϊ�գ����ͷ���׵�ַ�Ƿ���sitePart��ʼ��
		if (referer != null && referer.startsWith(sitePart)) {
			// �����������ص�����
			out.println("dealing download ...");
		} else {
			// �Ƿ�����������ת��download.htmlҳ��
			RequestDispatcher rd = request.getRequestDispatcher("/download.html");
			rd.forward(request, response);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}