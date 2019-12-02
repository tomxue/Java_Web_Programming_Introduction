package cn.itcast.chapter09.model2.util;
import java.util.HashMap;
import cn.itcast.chapter09.model2.domain.UserBean;
public class DBUtil {
	private static DBUtil instance = new DBUtil();
	private HashMap<String,UserBean> users = new HashMap<String,UserBean>();
	private DBUtil()
	{
		// �����ݿ�(users)�д�����������
		UserBean user1 = new UserBean();
		user1.setName("Jack");
		user1.setPassword("12345678");
		user1.setEmail("jack@it315.org");
		users.put("Jack ",user1);
		
		UserBean user2 = new UserBean();
		user2.setName("Rose");
		user2.setPassword("abcdefg");
		user2.setEmail("rose@it315.org");
		users.put("Rose ",user2);			
	}
	public static DBUtil getInstance()
	{
		return instance;
	}
	// ��ȡ���ݿ�(users)�е�����
	public UserBean getUser(String userName)
	{
		UserBean user = (UserBean) users.get(userName);
		return user;
	}
	// �����ݿ�(users)��������
	public boolean insertUser(UserBean user) 
	{
		if(user == null)
		{
			return false;
		}
		String userName = user.getName();
		if(users.get(userName) != null)
		{
			return false;
		}
		users.put(userName,user);
		return true;
	}
}