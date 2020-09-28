package special_class_12;

public class TesrRefDemo12_20 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person12_20 p1 = null;
		Person12_20 p2 = null;
		p1=new Person12_20();
		p1.name="张三";
		p1.age=25;
		p2=p1;//p1的引用赋值给p2， 	此时p1p2指向同一块内存
		System.out.println("姓名"+p2.name);
		System.out.println("年龄"+p2.age);
		p1=null;//p1断开了之前的引用，只有p2还在引用
		
		p2=null;//p1p2都断开了引用，则之前的对象无人引用，成为了垃圾对象（程序中不再使用的对象）
	}

}
