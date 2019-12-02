package cn.itcast.chapter08.introspector;
import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import cn.itcast.chapter08.javabean.Person;
public class IntrospectorDemo01 {
	public static void main(String[] args) throws Exception {
		//ʵ����һ��Person����
		Person beanObj = new Person();
		//����Person����һ����ص�BeanInfo��
		BeanInfo bInfoObject = Introspector.getBeanInfo(beanObj.getClass(),
				beanObj.getClass().getSuperclass());
		String str = "��ʡ��Ա���ԣ�\n";
		//��ȡ��Bean�е��������Ե���Ϣ����PropertyDescriptor�������ʽ����
		PropertyDescriptor[] mPropertyArray = bInfoObject
				.getPropertyDescriptors();
		for (int i = 0; i < mPropertyArray.length; i++) {
			//��ȡ������
			String propertyName = mPropertyArray[i].getName();
			//��ȡ��������
			Class propertyType = mPropertyArray[i].getPropertyType();
			//��ϳɡ������� (���Ե���������)���ĸ�ʽ
			str += propertyName + " ( " + propertyType.getName() + " )\n";
		}
		System.out.println(str);
	}
}