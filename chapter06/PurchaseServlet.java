package cn.itcast.chapter06.session.example01;
import java.io.IOException;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class PurchaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// ����û��������Ʒ
		String id = req.getParameter("id");
		if (id == null) {
			// ���idΪnull���ض���ListBookServletҳ��
			String url = "/chapter06/ListBookServlet";
			resp.sendRedirect(url);
			return;
		}
		Book book = BookDB.getBook(id);
		// �������߻���û���Session����
		HttpSession session = req.getSession();
		// ��Session�����л���û��Ĺ��ﳵ
		List<Book> cart = (List) session.getAttribute("cart");
		if (cart == null) {
			// �״ι���Ϊ�û�����һ�����ﳵ(List����ģ�⹺�ﳵ)
			cart = new ArrayList<Book>();
			// ������Ǵ���Session����
			session.setAttribute("cart", cart);
		}
		// ����Ʒ���빺�ﳵ
		cart.add(book);
		// ����Cookie���Session�ı�ʶ��
		Cookie cookie = new Cookie("JSESSIONID", session.getId());
		cookie.setMaxAge(60 * 30);
		cookie.setPath("/chapter06");
		resp.addCookie(cookie);
		// �ض��򵽹��ﳵҳ��
		String url = "/chapter06/CartServlet";
		resp.sendRedirect(url);
	}
}