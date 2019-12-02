package cn.itcast.chapter08.beanutils;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import cn.itcast.chapter08.javabean.Person;
public class BeanUtilsDemo02 {
	public static void main(String[] args) throws Exception {
		//获取指定JavaBean的Class对象
		Class clazz = Class.forName("cn.itcast.chapter08.javabean.Person");
		//创建对象
		Person p = (Person) clazz.newInstance();
		//创建map集合，用于存放属性及其属性值
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "张三");
		map.put("age", 10);
		//使用populate()方法为对象的属性赋值
		BeanUtils.populate(p, map);
		//打印赋值后对象的信息
		System.out.println(p);
	}
}