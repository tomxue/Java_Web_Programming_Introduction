package cn.itcast.chapter06.cookie.example;
import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.*;
public class LastAccessServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 指定服务器输出内容的编码方式UTF-8，防止发生乱码
		response.setContentType("text/html;charset=utf-8");
		/*
		 * 设定一个 cookie 的name : lastAccessTime
		 * 读取客户端发送cookie 获得用户上次的访问时间显示
                 */
		String lastAccessTime = null;
                // 获取所有的cookie，并将这些cookie存放在数组中
		Cookie[] cookies = request.getCookies();
		for (int i = 0; cookies != null && i < cookies.length; i++) {
			if ("lastAccess".equals(cookies[i].getName())) {
				// 如果cookie的名称为lastAccess,则获取该cookie的值
				lastAccessTime = cookies[i].getValue();
				break;
			}
		}
		// 判断是否存在名称为lastAccess的cookie
		if (lastAccessTime == null) {
			response.getWriter().print("您是首次访问本站！！！");
		} else {
		     response.getWriter().print("您上次的访问时间是： " 
                           + lastAccessTime);
		}
		// 创建cookie,将当前时间作为cookie的值发送给客户端
		Cookie cookie = new Cookie("lastAccess",
				new Date().toLocaleString());
		// 发送 cookie
		response.addCookie(cookie);
	}
   protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}
}