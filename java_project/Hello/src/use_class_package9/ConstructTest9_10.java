package use_class_package9;
class Person9_10{
	
	private String name;
	private int age;
	public Person9_10(String n ,int a ) {
		name = n ;
		age = a;
		System.out.println("publicPerson(String n , int a )");
	}
	public String  talk() {
		return "我是："  +name + ",今年" +age+ "岁";
	}
}
public class ConstructTest9_10 {
//构造方法的重载
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person9_10 p = new Person9_10("张三", 25);
		System.out.println(p.talk());
	}

}

