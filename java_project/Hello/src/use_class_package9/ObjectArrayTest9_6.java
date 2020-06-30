package use_class_package9;

public class ObjectArrayTest9_6 {
//	接Person9_6静态方式初始化对象数组
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		调用构造函数
		Person9_6 p[] = {new Person9_6("张三",25),new Person9_6("李四",35),new Person9_6("王五",66)};
		for (int i = 0; i < p.length; i++) {
//			Person9_6 person9_6 = p[i];
			System.out.println(p[i].talk());
		}
		
	}

}
