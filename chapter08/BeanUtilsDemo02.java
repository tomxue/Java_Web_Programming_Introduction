package cn.itcast.chapter08.beanutils;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;
import cn.itcast.chapter08.javabean.Person;
public class BeanUtilsDemo02 {
	public static void main(String[] args) throws Exception {
		//��ȡָ��JavaBean��Class����
		Class clazz = Class.forName("cn.itcast.chapter08.javabean.Person");
		//��������
		Person p = (Person) clazz.newInstance();
		//����map���ϣ����ڴ�����Լ�������ֵ
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", "����");
		map.put("age", 10);
		//ʹ��populate()����Ϊ��������Ը�ֵ
		BeanUtils.populate(p, map);
		//��ӡ��ֵ��������Ϣ
		System.out.println(p);
	}
}