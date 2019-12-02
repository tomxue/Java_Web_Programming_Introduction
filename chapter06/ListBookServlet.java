package cn.itcast.chapter06.session.example01;
import java.io.*;
import java.util.Collection;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class ListBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		Collection<Book> books = BookDB.getAll();
		out.write("��վ�ṩ��ͼ���У�<br>");
		for (Book book : books) {
			String url = "/chapter06/PurchaseServlet?id=" + book.getId();
			out.write(book.getName() + "<a href='" + url 
					+ "'>�������</a><br>");
		}
	}
}