package cn.itcast.chapter08.reflection;
import java.lang.reflect.Method;
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
	public String sayHello(String name,int age) {    //����sayHello()����
		return "��Һã�����"+name+"������"+age+"�꣡";
	}
}
public class ReflectDemo04 {
	public static void main(String[] args) throws Exception{
		// ʵ����Class����
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		// ��ȡPerson������ΪsayHello�ķ������÷����������βΣ��ֱ�ΪString���ͺ�int����
		Method md = clazz.getMethod("sayHello", String.class, int.class);
		// ����sayHello()����
		String result = (String) md.invoke(clazz.newInstance(), "����",35);
		System.out.println(result);
	}
}