package special_class_12;

public class TestOverEquals12_22 {
	public static void main(String[] args) {
		Person12_22 p1=new Person12_22("张三", 22);
		Person12_22 p2=new Person12_22("张三", 22);
		
//		p1 p2在不同的内存空间，指向不同的内存地址。equals调用的是Object中的equals方法，比较的是内存地址
		System.out.println(p1.equals(p2)?"是同一个":"不是同一个");
		
	}

}
