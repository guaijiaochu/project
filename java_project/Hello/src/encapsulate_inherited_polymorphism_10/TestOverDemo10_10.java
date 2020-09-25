package encapsulate_inherited_polymorphism_10;

public class TestOverDemo10_10{
	public static void main(String[] args) {
		Student10_10 s = new Student10_10("张三",25,"北京");
		
//		由于子类覆写了父类的talk()方法，因此此处调用子类中的talk()方法
		System.out.println(s.talk());
	}
}