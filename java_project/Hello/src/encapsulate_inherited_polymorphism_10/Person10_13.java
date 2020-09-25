package encapsulate_inherited_polymorphism_10;
//10_13父类对象强制转换为子类对象使用

class Person10_13{
	public 	void fun1() {
		System.out.println("1personfun1");
	}
	public 	void fun2() {
		System.out.println("2personfun2");
	}
	
}

//Student继承了person中的fun1 fun2方法
class Student10_13 extends Person10_13{
//	此处覆写了fun1方法
	public 	void fun1() {
		System.out.println("3Studentfun1");
	}
	public 	void fun3() {
		System.out.println("4Studentfun3");
	}
}



