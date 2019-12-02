package cn.itcast.chapter08.introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo03 {
	public static void main(String[] args) throws Exception {
		//����Person��Ķ���
		Person p = new Person();
		//ͨ��ֱ�ӵ���setter�����ķ�ʽΪ���Ը�ֵ
		p.setName("�");
		p.setAge(18);
		//ʹ��������������ȡPerson��name���Ե�������Ϣ
		PropertyDescriptor pd = new PropertyDescriptor("name",p.getClass());
		//��ȡname���Զ�Ӧ��getter����
		Method methodName = pd.getReadMethod();
		//����getter����������ȡname����ֵ
		Object o = methodName.invoke(p);
		System.out.println("������"+o);
		//ʹ��������������ȡPerson��age���Ե�������Ϣ
		pd = new PropertyDescriptor("age",p.getClass());
		//��ȡname���Զ�Ӧ��setter����
		Method methodAge = pd.getReadMethod();
		//����getter����������ȡage����ֵ
		o = methodAge.invoke(p);
		System.out.println("���䣺"+o);
	}
}