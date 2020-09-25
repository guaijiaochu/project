package encapsulate_inherited_polymorphism_10;
//10_9父类限制子类访问自己类中的全部属性和方法，private

class Person10_9{
	private String name;
	private int age;
}

class Student10_9 extends Person10_9{
//	访问父类中的属性
//	由于父类进行封装，因此子类无法访问
//	public void	setVar() {
//		name = "张三";
//		age = 25;
//	}
	
}



