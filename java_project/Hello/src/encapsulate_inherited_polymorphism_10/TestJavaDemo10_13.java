package encapsulate_inherited_polymorphism_10;

public class TestJavaDemo10_13{
	public static void main(String[] args) {
		
		
		
//		此处声明了父类对象p   由自身实例化
		Person10_13 p = new Person10_13();
//		将p向下转型
		Student10_13 s=(Student10_13)p;
		p.fun1();
		p.fun2();
	}
}