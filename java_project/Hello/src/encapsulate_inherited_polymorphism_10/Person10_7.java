package encapsulate_inherited_polymorphism_10;
//10-6子类对象的实例化过程
//调用父类中有2个参数的构造方法
class Person10_7{
	int age;
	String name;
	//	父类中的构造方法
	public Person10_7(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
}

class Student10_7 extends Person10_7{
	String school;	
	//	子类中的构造方法
	public Student10_7() {
		super("张三",25);//通过super()调用父类有2个参数的构造方法	

	}
	
}


