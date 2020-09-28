package special_class_12;

/*再谈方法
如果不需要传参到方法中，括号中不需要填任何内容
如果方法没有返回值，return可以省略*/

public class TestJavashengming12_13 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		star();
		System.out.println("66666");
		star();
	}
	
//	此处加static：static方法只能访问到static成员变量
	public static void star() {
		for (int i=0;i<2;i++) {
			System.out.print("*\n");
			
		}
		
	}

}
