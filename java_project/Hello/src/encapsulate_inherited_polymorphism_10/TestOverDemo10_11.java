package encapsulate_inherited_polymorphism_10;

public class TestOverDemo10_11{
	public static void main(String[] args) {
		Student10_11 s = new Student10_11("张三",25,"北京");
		
//		由于子类覆写了父类的talk()方法，因此此处调用子类中的talk()方法
//		但是在Person10_11中通过super.talk()调用了父类的方法
//		因此在子类中可以通过super.talk()调用父类中被覆写的方法
		System.out.println(s.talk());
	}
}