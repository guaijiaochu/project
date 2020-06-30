package hellopackage_basic_1_8;

//产生随机数的类
import java.util.Random;

public class arrayAssignment8_3_2 {

	public static void main(String[] args) {
//***引用的示例
		Random rand = new Random();//创建一个Random对象
		int[] a = null;//声明整型数组a
		int[] b = null;
		
		//开辟内存空间，rand.nextlnt(10)返回一个[0,10)的随机数
		a = new int[rand.nextInt(10)];
		b = a;
		
		System.out.println("数组的a长度为："+a.length);
		System.out.println("数组的b长度为："+b.length);
		
		for (int i = 0; i < a.length; i++) {
			
			//rand.nextInt(100)返回一个[0,100)的随机整型数
			a[i] = rand.nextInt(100);
			System.out.print("a["+i+"]="+a[i]+"\t\t\t");
			System.out.println("b["+i+"]="+b[i]);
			
			//关键代码是b=a这一行，其含义是将a数组的引用赋值给数组b，这时a和b指向的数组对象是相同的。
			//换句话说，此时a和b是“一套数组，两套名字”，这就是java中广泛使用的概念--引用（reference）
		}
			
		
	}

}
