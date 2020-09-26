package abstract_interface_11;
/*
接口与抽象类的不同
1.接口的数据成员必须初始化，且不能更改，且数据成员均为常量；
2.接口里的方法必须全部声明为abstract，接口不能像抽象类一样保有一般方法，必须全部是抽象方法

java中接口是实现多继承的一种机制，每个由接口实现的类必须在累内部覆写接口中的方法，且可自由使用接口中的常量

既然接口只有抽象方法，只要声明而不用定义处理方式，于是可想到接口像一般类一样，用它创建对象。用接口打造新类的过程，称为接口实现

接口实现语法
class 类名称	implements 接口A，接口B{}//接口的实现

*/
interface Person11_3 {
	String name = "张三";
	int age = 25;
	String occupation = "学生";
//	声明抽象方法talk（）
	public abstract String talk();
}

//	student类实现自person接口	
class Student11_3 implements Person11_3{
//	覆写talk()
	public String talk() {
		return "学生--》姓名"+this.name+"，年龄"+this.age+",职业"+this.occupation;
	}
	
}
