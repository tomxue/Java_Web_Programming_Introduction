package cn.itcast.chapter09.model2.domain;
import java.util.HashMap;
import java.util.Map;
public class RegisterFormBean {
	private String name;
	private String password;
	private String password2;
	private String email;
	private Map<String, String> errors = new HashMap<String, String>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword2() {
		return password2;
	}
	public void setPassword2(String password2) {
		this.password2 = password2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean validate() {
		boolean flag = true;
		if (name == null || name.trim().equals("")) {
			errors.put("name", "����������.");
			flag = false;
		}
		if (password == null || password.trim().equals("")) {
			errors.put("password", "����������.");
			flag = false;
		} else if (password.length() > 12 || password.length() < 6) {
			errors.put("password", "������6-12���ַ�.");
			flag = false;
		}
		if (password != null && !password.equals(password2)) {
			errors.put("password2", "������������벻ƥ��.");
			flag = false;
		}
		// ��email��ʽ��У�������������ʽ
		if (email == null || email.trim().equals("")) {
			errors.put("email", "����������.");
			flag = false;
		} else if (!email
				.matches("[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+")) {
			errors.put("email", "�����ʽ����.");
			flag = false;
		}
		return flag;
	}
    // ��Map����errors����Ӵ�����Ϣ
	public void setErrorMsg(String err, String errMsg) {
		if ((err != null) && (errMsg != null)) {
			errors.put(err, errMsg);
		}
	}
    // ��ȡerrors����
     public Map<String, String> getErrors() {
		return errors;
	}
}