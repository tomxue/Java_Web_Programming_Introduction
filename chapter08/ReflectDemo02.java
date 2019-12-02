package cn.itcast.chapter08.reflection;
import java.lang.reflect.Constructor;
class Person {
	private String name;	//��������name����ʾ����
	private int age;		//��������age����ʾ����
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
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
public class ReflectDemo02 {
	public static void main(String[] args) throws Exception{
         //����Ҫʵ���������������.�ࡱ����
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		//ͨ�������ȡȫ�����췽��
		Constructor cons[] = clazz.getConstructors();
 		//���췽���д��ݲ�������ʵ����Person����
		//��Ϊֻ��һ�����췽������������С��Ϊ0
		Person p = (Person) cons[0].newInstance("�",30);
		System.out.println(p);
	}
}