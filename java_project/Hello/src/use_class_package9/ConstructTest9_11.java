package use_class_package9;
class Person9_11{
	
	private String name;
	private int age;
	
//	如果程序中没有构造方法，程序会自动声明一个无参的构造方法（如下），
//	但是本例中，程序中有一个含有2个参数的构造方法，因此需要明确声明一个无参的构造方法
	public Person9_11() {
	}
	
	public Person9_11(String n ,int a ) {
		name = n ;
		age = a;
		System.out.println("publicPerson9_11(String n , int a )");
	}
	public String  talk() {
		return "我是："  +name + ",今年" +age+ "岁";
	}
}
public class ConstructTest9_11 {
//构造方法的重载
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person9_11 p = new Person9_11();//此处未传参
		System.out.println(p.talk());
	}

}


//无



