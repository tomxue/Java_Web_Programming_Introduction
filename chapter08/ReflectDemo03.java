package cn.itcast.chapter08.reflection;
import java.lang.reflect.Field;
class Person {
	private String name;	//定义属性name，表示姓名
	private int age;		//定义属性age，表示年龄
	public String toString() {    //重写toString()方法
		return "姓名："+this.name+"，年龄："+this.age;
	}
}
public class ReflectDemo03 {
	public static void main(String[] args) throws Exception{
		//获取Person类对应的Class对象
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		//创建一个Person对象
		Object p = clazz.newInstance();
		//获取Person类中指定名称的属性
		Field nameField = clazz.getDeclaredField("name");
		//设置通过反射访问该属性时取消权限检查
		nameField.setAccessible(true);
		//调用set方法为p对象的指定属性赋值
		nameField.set(p, "李四");
		//获取Person类中指定名称的属性
		Field ageField = clazz.getDeclaredField("age");
		//设置通过反射访问该属性时取消权限检查
		ageField.setAccessible(true);
		//调用set方法为p对象的指定属性赋值
		ageField.set(p, 20);
		System.out.println(p);
	}
}