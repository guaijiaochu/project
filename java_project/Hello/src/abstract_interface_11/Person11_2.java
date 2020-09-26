package abstract_interface_11;
/*
抽象类的使用
*/
abstract class Person11_2 {
//	限制子类的访问
	String name;
	int age;
	String occupation;
	public Person11_2(String name,int age,String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
		
	}
//	声明抽象方法talk（）
	public abstract String talk();
	
}


//student类继承person类
class Student11_2 extends Person11_2{
	public Student11_2(String name,int age,String occupation) {	
//		这里必须调用抽象类中的构造方法
		super(name,age,occupation);
	}
	

	public String talk() {
		return "学生--》姓名"+this.name+"，年龄"+this.age+",职业"+this.occupation;
	}
	
}

