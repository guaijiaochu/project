package special_class_12;


//this关键字使用范例
public class Person12_28 {
	private String name;
	private int age;
	public Person12_28(String name,int age) {
		this.name=name;//this.name代表类中的name
		this.age=age;//将方法传来的参数赋值给类中的对象
	}
	
	public String talk() {
		return "我是"+name+"今年"+age+"岁";
	}
	
}
	
