package cn.itcast.chapter08.javabean;
public class Student {
	private String sid;
	private String name;
	private int age;
	private boolean married;
	//age���Ե�getter��setter����
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//married���Ե�getter��setter����
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	//sid���Ե�getter����
	public String getSid() {
		return sid;
	}
	//name���Ե�setter����
	public void setName(String name) {
		this.name = name;
	}
	public void getInfo() {
		System.out.print("����һ��ѧ��");
	}
}