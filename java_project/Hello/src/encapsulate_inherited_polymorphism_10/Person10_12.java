package encapsulate_inherited_polymorphism_10;
//10_12对象多态性的使用
//p是父类对象，调用方法时候却调用了子类中被覆写的fun1方法。
//因为父类对象并非由其本身的类实例化，而是通过子类实例化，这就是对象的多态性
//即子类实例化对象可以转化为父类实例化对象

class Person10_12{
	public 	void fun1() {
		System.out.println("1personfun1");
	}
	public 	void fun2() {
		System.out.println("2personfun2");
	}
	
}

//Student继承了person中的fun1 fun2方法
class Student10_12 extends Person10_12{
//	此处覆写了fun1方法
	public 	void fun1() {
		System.out.println("3Studentfun1");
	}
	public 	void fun3() {
		System.out.println("4Studentfun3");
	}
}



