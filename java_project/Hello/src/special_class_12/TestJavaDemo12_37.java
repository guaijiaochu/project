package special_class_12;

public class TestJavaDemo12_37 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
/*
 * 声明父类对象通过子类实例化 原因： 定义一个父类类型的引用指向一个子类的对象既可以使用子类强大的功能，又可以抽取父类的共性。
 * 所以，父类类型的引用可以调用父类中定义的所有属性和方法，而对于子类中定义而父类中没有的方法，它是无可奈何的；
 * 同时，父类中的一个方法只有在在父类中定义而在子类中没有重写的情况下，才可以被父类类型的引用调用；
 * 对于父类中定义的方法，如果子类中重写了该方法，那么父类类型的引用将会调用子类中的这个方法，这就是动态连接。
 */
		Person12_37 p = new Student12_37();
		
//		判断p是否是student的实例
		if(p instanceof Student12_37)
		{
			Student12_37 s=(Student12_37)p;
			s.fun1();
		}
		else {
			p.fun2();
		}
		
	}

}
