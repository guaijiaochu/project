package encapsulate_inherited_polymorphism_10;
//10-6子类对象的实例化过程
//子类对象在实例化时，会默认先去调用父类中的无参构造方法，之后再调用本类中的相应构造方法
class Person10_6{
	int age;
	String name;
	//	父类中的构造方法
	public Person10_6() {
		System.out.println("public person");
	}
	
}

class Student10_6 extends Person10_6{
	String school;	
	//	子类中的构造方法
	public Student10_6() {
//		super();//程序在此处隐含了这样一条语句，默认调用父类的无参构造方法
		
		
		System.out.println("public student");
	}
	
}


