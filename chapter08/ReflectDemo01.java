package cn.itcast.chapter08.reflection;
class Person {
	private String name;	//��������name����ʾ����
	private int age;		//��������age����ʾ����
	public String getName() {
		return name;
	}
	public void setName(String name) { //����name����
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //����age����
		this.age = age;
	}
	public String toString() {    //��дtoString()����
		return "������"+this.name+"�����䣺"+this.age;
	}
}
public class ReflectDemo01 {
	public static void main(String[] args) throws Exception{
	    // ����Ҫʵ���������������.�ࡱ����
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		// ʵ����Person����
		Person p = (Person) clazz.newInstance();
		p.setName("�");
		p.setAge(18);
		System.out.println(p);
	}
}