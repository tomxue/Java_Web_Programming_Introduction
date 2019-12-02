package cn.itcast.chapter08.javabean;
class X{}
public class GetClassNameDemo {
	public static void main(String[] args) {
		X x = new X();
		System.out.println(x.getClass().getName());
	}
}