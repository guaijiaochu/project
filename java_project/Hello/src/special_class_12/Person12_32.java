package special_class_12;


//静态变量
//static 声明的属性是所有对象共享的，其中一个对象修改了该属性，所有对象都会被修改。因此static声明的变量称为“类变量”
public class Person12_32 {
	String name;
	int age;
	static String city= "中国";
	public Person12_32(String name,int age) {
		this.name=name;//this.name代表类中的name
		this.age=age;//将方法传来的参数赋值给类中的对象
	}
	
	public String talk() {
		return "我是"+name+"，今年"+age+"岁,来自"+city;
	}
	
}
	
