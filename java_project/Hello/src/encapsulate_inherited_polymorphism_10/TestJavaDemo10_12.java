package encapsulate_inherited_polymorphism_10;

public class TestJavaDemo10_12{
	public static void main(String[] args) {
		
		
		
//		此处声明了父类对象p    由子类对象实例化
		Person10_12 p = new Student10_12();
		
//		调用fun1方法，观察调用的是哪个类的fun1
		p.fun1();
		p.fun2();
	}
}