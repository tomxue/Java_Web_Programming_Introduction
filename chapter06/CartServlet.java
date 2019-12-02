package cn.itcast.chapter06.session.example01;
import java.io.*;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class CartServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		// ����cart�����û��Ĺ��ﳵ
		List<Book> cart = null;
		// ����pruFlag����û��Ƿ������Ʒ
		boolean purFlag = true;
		// ����û���session
		HttpSession session = req.getSession(false);
		// ���sessionΪnull��purFlag��Ϊfalse
		if (session == null) {
			purFlag = false;
		} else {
			// ����û����ﳵ
			cart = (List) session.getAttribute("cart");
			// ����õĹ��ﳵΪnull��purFlag��Ϊfalse
			if (cart == null) {
				purFlag = false;
			}
		}
		/*
		 * ���purFlagΪfalse�������û�û�й���ͼ�� �ض���ListServletҳ��
		 */
		if (!purFlag) {
			out.write("�Բ�������û�й����κ���Ʒ��<br>");
		} else {
			// ������ʾ�û�����ͼ�����Ϣ
			out.write("�������ͼ���У�<br>");
			double price = 0;
			for (Book book : cart) {
				out.write(book.getName() + "<br>");
			}
		}
	}
}