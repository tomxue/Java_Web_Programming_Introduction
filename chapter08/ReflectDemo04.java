package cn.itcast.chapter08.reflection;
import java.lang.reflect.Method;
class Person {
	private String name;	//定义属性name，表示姓名
	private int age;		//定义属性age，表示年龄
	public String getName() {
		return name;
	}
	public void setName(String name) { //设置name属性
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { //设置age属性
		this.age = age;
	}
	public String sayHello(String name,int age) {    //定义sayHello()方法
		return "大家好，我是"+name+"，今年"+age+"岁！";
	}
}
public class ReflectDemo04 {
	public static void main(String[] args) throws Exception{
		// 实例化Class对象
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		// 获取Person类中名为sayHello的方法，该方法有两个形参，分别为String类型和int类型
		Method md = clazz.getMethod("sayHello", String.class, int.class);
		// 调用sayHello()方法
		String result = (String) md.invoke(clazz.newInstance(), "张三",35);
		System.out.println(result);
	}
}