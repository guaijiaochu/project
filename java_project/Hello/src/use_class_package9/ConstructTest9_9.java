package use_class_package9;
public class ConstructTest9_9 {
//	构造方法的使用
//	构造方法：
//	名称与类名相同
//	无返回值
//	一般方法需要时调用，构造方法创建对象时自动调用，在对象产生时自动执行。可利用它对对象数据成员做初始化赋值

//构造方法的基本作用就是对类中的属性进行初始化
	public static void main(String[] args) {
		Person9_9 p = new Person9_9();//实例化了一个Person9_9类的对象p，会自动调用Person9_9中的无参构造方法
		Person9_9 a = new Person9_9();//实例化一次，调用一次构造方法
		
	}

}


class Person9_9{
	public Person9_9(){
		System.out.println("public Person9_9()");
	}
	
}
