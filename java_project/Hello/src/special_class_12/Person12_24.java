package special_class_12;

/*
接口对象的实例化
接口无法直接实例化，因为接口没有构造方法
由对象多态的概念，可以通过接口的子类对其实例化
*/

public interface Person12_24 {
	public void fun1();//声明了一个接口，只有一个抽象方法
}

class Student12_24 implements Person12_24{//声明了一个Student12_24类，实现Person接口，覆写fun1方法
	public void fun1() {
		System.out.println("studentfun1");
	}
}

