package special_class_12;

/*静态代码块
一个类可以使用不包含任何方法提的静态代码块
当类被载入，静态代码块会首先被执行，且只执行一次
静态代码块经常用来对类的静态属性进行初始化*/
public class Person12_35 {

	public Person12_35() {
		System.out.println("1publicperson");
	}
	
	static {
		System.out.println("person类的静态代码块被调用");
	}
	

}
	
