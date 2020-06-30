package use_class_package9;

public class Person9_6 {
	String name;
	int age ;
	
//	两个构造函数
//	构造函数是没有返回类型，这个没有就是完全无，void都没有的。
	public  Person9_6() {
		
	}
	public   Person9_6(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	public String talk() {
		return "我是：" +name+ ",今年" +age+ "岁";
	}
}


