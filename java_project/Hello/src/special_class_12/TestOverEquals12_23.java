package special_class_12;

public class TestOverEquals12_23 {
	public static void main(String[] args) {
		Person12_23 tp1=new Person12_23("张三", 22);
		Person12_23 tp2=new Person12_23("张三", 22);

		System.out.println(tp1.equals(tp2)?"是同一个":"不是同一个");
		
	}

//没有得到想要的结果
}
