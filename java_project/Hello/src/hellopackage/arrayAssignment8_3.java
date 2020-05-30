package hellopackage;

//产生随机数的类
import java.util.Random;

public class arrayAssignment8_3 {

	public static void main(String[] args) {
//***数组更加灵活的赋值方法
		Random rand = new Random();//创建一个Random对象
		int[] a = null;//声明整型数组a
		
		//开辟内存空间，rand.nextlnt(10)返回一个[0,10)的随机数
		a = new int[rand.nextInt(10)];
		System.out.println("数组的长度为："+a.length);
		
		for (int i = 0; i < a.length; i++) {
			
			//rand.nextInt(100)返回一个[0,100)的随机整型数
			a[i] = rand.nextInt(100);
			System.out.println("a["+i+"]="+a[i]);
		}
			
		
	}

}
