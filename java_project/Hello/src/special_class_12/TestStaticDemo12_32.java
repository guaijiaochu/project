package special_class_12;

public class TestStaticDemo12_32 {

	public static void main(String[] args) {
		Person12_32 p1=new Person12_32("张1", 25);
		Person12_32 p2=new Person12_32("张2", 25);
		Person12_32 p3=new Person12_32("张3", 25);
		
		System.out.println("修改前："+p1.talk());
		System.out.println("修改前："+p2.talk());
		System.out.println("修改前："+p3.talk());
		
		p1.city="美国";
		
		System.out.println("修改后："+p1.talk());
		System.out.println("修改后："+p2.talk());
		System.out.println("修改后："+p3.talk());
	}

}
