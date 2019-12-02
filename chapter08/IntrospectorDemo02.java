package cn.itcast.chapter08.introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo02 {
	public static void main(String[] args) throws Exception {
		//创建Person类的对象
		Person p = new Person();
		//使用属性描述器获取Person类name属性的描述信息
		PropertyDescriptor pd = new PropertyDescriptor("name",p.getClass());
		//获取name属性对应的setter方法
		Method methodName = pd.getWriteMethod();
		//调用setter方法，并设置（修改）name属性值
		methodName.invoke(p, "小明");
		//String类型的数据，表示年龄
		String val = "20";
		//使用属性描述器获取Person类age属性的描述信息
		pd = new PropertyDescriptor("age",p.getClass());
		//获取age属性对应的setter方法
		Method methodAge = pd.getWriteMethod();
		//获取属性的Java数据类型
		Class clazz = pd.getPropertyType();
		//根据类型来判断需要为setter方法传入什么类型的实参
		if(clazz.equals(int.class)){
			//调用setter方法，并设置（修改）age属性值
			methodAge.invoke(p, Integer.valueOf(val));
		}else{
			methodAge.invoke(p, val);
		}
		System.out.println(p);
	}
}