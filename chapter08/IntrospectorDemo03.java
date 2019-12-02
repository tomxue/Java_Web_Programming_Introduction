package cn.itcast.chapter08.introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo03 {
	public static void main(String[] args) throws Exception {
		//创建Person类的对象
		Person p = new Person();
		//通过直接调用setter方法的方式为属性赋值
		p.setName("李芳");
		p.setAge(18);
		//使用属性描述器获取Person类name属性的描述信息
		PropertyDescriptor pd = new PropertyDescriptor("name",p.getClass());
		//获取name属性对应的getter方法
		Method methodName = pd.getReadMethod();
		//调用getter方法，并获取name属性值
		Object o = methodName.invoke(p);
		System.out.println("姓名："+o);
		//使用属性描述器获取Person类age属性的描述信息
		pd = new PropertyDescriptor("age",p.getClass());
		//获取name属性对应的setter方法
		Method methodAge = pd.getReadMethod();
		//调用getter方法，并获取age属性值
		o = methodAge.invoke(p);
		System.out.println("年龄："+o);
	}
}