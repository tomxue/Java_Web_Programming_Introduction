package cn.itcast.chapter08.javabean;
public class Person {
	private String name; // 定义属性name，表示姓名
	private int age;     // 定义属性age，表示年龄
	public String getName() {
		return name;
	}
	public void setName(String name) { // 设置name属性
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) { // 设置name属性
		this.age = age;
	}
	//重写toString()方法
	public String toString() {
		return "姓名："+this.name+"，年龄："+this.age;
	}
}