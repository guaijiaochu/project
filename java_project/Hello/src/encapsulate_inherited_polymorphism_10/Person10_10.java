package encapsulate_inherited_polymorphism_10;
//10_10子类覆写父类
/*
class Super{
	访问权限 方法返回值类型 方法1(参数1){}
}
class Sub extends Super{
	访问权限 方法返回值类型 方法1(参数1)  覆写父类中的方法
}

重载和覆写区别
重载：方法名称相同在不同场合做不同的事
覆写：子类继承父类时，子类中的 方法名称、参数个数、类型 完全一致
*/

class Person10_10{
	 String name;
	 int age;
	 
	 public String talk() {
		 return "我是："+this.name+",今年："+age+"岁";
	 }
}

class Student10_10 extends Person10_10{
	String school;
	public Student10_10(String name,int age,String school) {
		//		分别为属性赋值
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	//	此处覆写Person中的talk()方法
	public String talk() {
		return "我在"+this.school+"上学";
	}
}



