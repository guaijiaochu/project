package abstract_interface_11;
/*
java中可以创建一种专门的类当做父类，这种类称为“抽象类”	。比普通类多了抽象方法。
抽象方法是只声明未实现的方法，所有抽象方法必须用abstract关键字声明，包含抽象方法的类也必须用abstract class声明
定义规则：
	1.抽象类、抽象方法必须用abstract修饰
	2.抽象类不能被直接实例化，也就是不能直接用new关键字去产生对象
	3.抽象方法只需声明，而不需实现
	4.含抽象方法的类也必须声明为抽象类，抽象类的子类必须覆写所有的抽象方法后才能被实例化，否则该子类还是抽象类

抽象类作用：
老是在想为什么要引用抽象类，一般类不就够用了吗。一般类里定义的方法，子类也可以覆盖，没必要定义成抽象的啊。
其实不是说抽象类有什么用，一般类确实也能满足应用，但是现实中确实有些父类中的方法确实没有必要写，
因为各个子类中的这个方法肯定会有不同，所以没有必要再父类里写。当然你也可以把抽象类都写成非抽象类，但是这样没有必要。
而写成抽象类，这样别人看到你的代码，或你看到别人的代码，你就会注意抽象方法，而知道这个方法是在子类中实现的，
所以，有个提示作用。

什么时候使用抽象类和接口?
如果你拥有一些方法并且想让它们中的一些有默认实现，那么使用抽象类吧。
如果你想实现多重继承，那么你必须使用接口。由于Java不支持多继承，子类不能够继承多个类，但可以实现多个接口。因此你就可以使用接口来解决它。
如果基本功能在不断改变，那么就需要使用抽象类。如果不断改变基本功能并且使用接口，那么就需要改变所有实现了该接口的类。

*/
abstract class Person11_1 {
//	限制子类的访问
	String name;
	int age;
	String occupation;
	
//	声明抽象方法talk（）
	public abstract String talk();
}


//student类继承person类
class Student11_1 extends Person11_1{
	public Student11_1(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
//	覆写talk()方法
	public String talk() {
		return "学生--》姓名"+this.name+"，年龄"+this.age+",职业"+this.occupation;
	}
	
}

class Worker11_1 extends Person11_1 {
	public Worker11_1(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
//	覆写talk()方法
	public String talk() {
		return "工人--》姓名"+this.name+"，年龄"+this.age+",职业"+this.occupation;
	}
	
	
}
