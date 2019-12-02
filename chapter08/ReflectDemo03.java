package cn.itcast.chapter08.reflection;
import java.lang.reflect.Field;
class Person {
	private String name;	//��������name����ʾ����
	private int age;		//��������age����ʾ����
	public String toString() {    //��дtoString()����
		return "������"+this.name+"�����䣺"+this.age;
	}
}
public class ReflectDemo03 {
	public static void main(String[] args) throws Exception{
		//��ȡPerson���Ӧ��Class����
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		//����һ��Person����
		Object p = clazz.newInstance();
		//��ȡPerson����ָ�����Ƶ�����
		Field nameField = clazz.getDeclaredField("name");
		//����ͨ��������ʸ�����ʱȡ��Ȩ�޼��
		nameField.setAccessible(true);
		//����set����Ϊp�����ָ�����Ը�ֵ
		nameField.set(p, "����");
		//��ȡPerson����ָ�����Ƶ�����
		Field ageField = clazz.getDeclaredField("age");
		//����ͨ��������ʸ�����ʱȡ��Ȩ�޼��
		ageField.setAccessible(true);
		//����set����Ϊp�����ָ�����Ը�ֵ
		ageField.set(p, 20);
		System.out.println(p);
	}
}