package special_class_12;


//this关键字强调对象本身，this表示当前对象(当前对象指的是调用类中方法或属性的那个对象)
public class Person12_26 {
//	在构造方法中声明与方法同名的参数
	private String name;
	private int age;
	public Person12_26(String name,int age) {
//		在此处，不清楚是	形参name赋值给类中属性name，还是类中属性name赋值给形参name
//		name=name;
//		age=age;
		

		this.name=name;//this.name代表类中的name
		this.age=age;
		
	}
}
	
