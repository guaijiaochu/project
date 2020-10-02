package package_demo_14;

import package_demo_14test.Person14_1;;

/*
 	14_3
 	几个类分属不同的包，在某个类访问其他包的类成员时候：
	被访问的类必须公开：public
	import 包名称.类名称;	*/

public class TestPackage14_3 {

	public static void main(String[] args) {
		System.out.println(new Person14_1().talktest());
		
//		此处未导入14—2但是可以通过包名.类名的方式使用
		System.out.println(new package_demo_14test.Person14_2().talktest());
	}

}
