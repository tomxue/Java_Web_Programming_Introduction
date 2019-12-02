package cn.itcast.chapter08.reflection;
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
	public String toString() {    //重写toString()方法
		return "姓名："+this.name+"，年龄："+this.age;
	}
}
public class ReflectDemo01 {
	public static void main(String[] args) throws Exception{
	    // 传入要实例化类的完整“包.类”名称
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		// 实例化Person对象
		Person p = (Person) clazz.newInstance();
		p.setName("李芳");
		p.setAge(18);
		System.out.println(p);
	}
}