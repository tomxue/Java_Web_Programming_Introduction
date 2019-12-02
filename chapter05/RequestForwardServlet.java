package cn.itcast.chapter05.request;
import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;
public class RequestForwardServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
                // �����ݴ洢��request������
		request.setAttribute("company", "�������ǲ��ͽ������޹�˾");		
                RequestDispatcher dispatcher = request
				.getRequestDispatcher("/ResultServlet");
		dispatcher.forward(request, response);
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}