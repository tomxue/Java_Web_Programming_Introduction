package cn.itcast.chapter08.javabean;
public class Person {
	private String name; // ��������name����ʾ����
	private int age;     // ��������age����ʾ����
	public String getName() {
		return name;
	}
	public void setName(String name) { // ����name����
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { // ����name����
		this.age = age;
	}
	//��дtoString()����
	public String toString() {
		return "������"+this.name+"�����䣺"+this.age;
	}
}