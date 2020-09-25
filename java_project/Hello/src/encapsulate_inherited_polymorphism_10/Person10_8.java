package encapsulate_inherited_polymorphism_10;
//10_8super不仅可以调用父类中的构造方法，也可用于调用父类中的属性或方法
//super.父类的属性
//super.父类的方法

class Person10_8{
	int age;
	String name;
	//	父类中的构造方法
	public Person10_8() {

	}
	
	public String talk() {
		return "我是："+this.name+"，今年："+this.age+"岁";
		
	}
	
}

class Student10_8 extends Person10_8{
	String school;	
	//	子类中的构造方法
	public Student10_8(String name,int age,String school) {
		super.name=name;//通过super()调用父类中的属性
		super.age=age;
		
//		调用父类中的talk方法
		System.out.println(super.talk());
		
//		调用本类的school属性
		this.school=school;

	}
	
}


