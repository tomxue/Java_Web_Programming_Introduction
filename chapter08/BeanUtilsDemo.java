package cn.itcast.chapter08.beanutils;
import org.apache.commons.beanutils.BeanUtils;
import cn.itcast.chapter08.javabean.Person;
public class BeanUtilsDemo01 {
	public static void main(String[] args) throws Exception{
		Person p = new Person();
         //ʹ��BeanUtilsΪ���Ը�ֵ
		BeanUtils.setProperty(p, "name", "Jack");
		BeanUtils.setProperty(p, "age", 10);
         //ʹ��BeanUtils��ȡ����ֵ
		String name = BeanUtils.getProperty(p, "name");
		String age = BeanUtils.getProperty(p, "age");
		System.out.println("�ҵ�������"+name+",�ҽ���"+age+"���ˣ�");
	}
}