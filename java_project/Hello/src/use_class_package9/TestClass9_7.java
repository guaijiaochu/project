package use_class_package9;

public class TestClass9_7 {
//类的属性的使用
	static String a = "string-a ";
	static String b;
	String c = "string-c ";
	String d;
	
//	静态代码块
	static {
		printStatic("before static");
		b="string-b";
		printStatic("after static");
	}
	
	public static void  printStatic(String title) {
		System.out.println("--------" + title + "--------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
	}
	
	public TestClass9_7() {
		print("before constructor构造函数之前");
		d="string-d";
		print("after constructor构造函数之后");
	}
	
	public void print(String title) {
		System.out.println("--------" + title + "--------");
		System.out.println("a=\""+a+"\"");
		System.out.println("b=\""+b+"\"");
		System.out.println("c=\""+c+"\"");
		System.out.println("d=\""+d+"\"");
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestClass9_7();
	}

}
