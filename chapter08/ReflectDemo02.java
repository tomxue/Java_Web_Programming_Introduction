package cn.itcast.chapter08.reflection;
import java.lang.reflect.Constructor;
class Person {
	private String name;	//定义属性name，表示姓名
	private int age;		//定义属性age，表示年龄
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
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
public class ReflectDemo02 {
	public static void main(String[] args) throws Exception{
         //传入要实例化类的完整“包.类”名称
		Class clazz = Class.forName("cn.itcast.chapter08.reflection.Person");
		//通过反射获取全部构造方法
		Constructor cons[] = clazz.getConstructors();
 		//向构造方法中传递参数，并实例化Person对象
		//因为只有一个构造方法，所以数组小标为0
		Person p = (Person) cons[0].newInstance("李芳",30);
		System.out.println(p);
	}
}