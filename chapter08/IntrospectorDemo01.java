package cn.itcast.chapter08.introspector;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo01 {
	public static void main(String[] args) throws Exception {
		//实例化一个Person对象
		Person beanObj = new Person();
		//依据Person产生一个相关的BeanInfo类
		BeanInfo bInfoObject = Introspector.getBeanInfo(beanObj.getClass(),
				beanObj.getClass().getSuperclass());
		String str = "内省成员属性：\n";
		//获取该Bean中的所有属性的信息，以PropertyDescriptor数组的形式返回
		PropertyDescriptor[] mPropertyArray = bInfoObject
				.getPropertyDescriptors();
		for (int i = 0; i < mPropertyArray.length; i++) {
			//获取属性名
			String propertyName = mPropertyArray[i].getName();
			//获取属性类型
			Class propertyType = mPropertyArray[i].getPropertyType();
			//组合成“属性名 (属性的数据类型)”的格式
			str += propertyName + " ( " + propertyType.getName() + " )\n";
		}
		System.out.println(str);
	}
}