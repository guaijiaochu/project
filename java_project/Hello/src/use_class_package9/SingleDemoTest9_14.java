package use_class_package9;



class Person9_14 {
//构造方法 的私有
	
	
	String name;
//	在本类声明一个Person对象p，用final标记，不能再重新实例化
	private static final Person9_14 p = new Person9_14();
	private Person9_14() {
		 name = "张三";
	}
	
	public static Person9_14 getP() {
		return p;
	}
}
public class SingleDemoTest9_14 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person9_14 p = null;
		p = Person9_14.getP();
		System.out.println(p.name);

	}

}
