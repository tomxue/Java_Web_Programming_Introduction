package cn.itcast.chapter08.introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo02 {
	public static void main(String[] args) throws Exception {
		//����Person��Ķ���
		Person p = new Person();
		//ʹ��������������ȡPerson��name���Ե�������Ϣ
		PropertyDescriptor pd = new PropertyDescriptor("name",p.getClass());
		//��ȡname���Զ�Ӧ��setter����
		Method methodName = pd.getWriteMethod();
		//����setter�����������ã��޸ģ�name����ֵ
		methodName.invoke(p, "С��");
		//String���͵����ݣ���ʾ����
		String val = "20";
		//ʹ��������������ȡPerson��age���Ե�������Ϣ
		pd = new PropertyDescriptor("age",p.getClass());
		//��ȡage���Զ�Ӧ��setter����
		Method methodAge = pd.getWriteMethod();
		//��ȡ���Ե�Java��������
		Class clazz = pd.getPropertyType();
		//�����������ж���ҪΪsetter��������ʲô���͵�ʵ��
		if(clazz.equals(int.class)){
			//����setter�����������ã��޸ģ�age����ֵ
			methodAge.invoke(p, Integer.valueOf(val));
		}else{
			methodAge.invoke(p, val);
		}
		System.out.println(p);
	}
}