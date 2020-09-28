package special_class_12;

public class TesrRefDemo12_21 {

	public static void main(String[] args) {
		Change12_21 c = new Change12_21();
		c.x = 20;
		fun(c);//将对象值赋给了c1，此时c1和c指向同一个对象
		System.out.println(c.x);
	}
	
//	fun方法接收的是一个对象引用，所以在fun方法中的操作会影响原参数
	public static void fun(Change12_21 c1) {
		c1.x = 25;
//		c1和c指向同一个对象，c1修改值同时c的值也改了
	}

}
