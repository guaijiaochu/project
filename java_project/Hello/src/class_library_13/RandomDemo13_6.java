
package class_library_13;

import java.util.Random;

public class RandomDemo13_6 {

//	Math类包含了所有用于几何和三角的浮点运算方法，都是静态的
//	Random是随机数产生器
	
	public static void main(String[] args) {
		//生成5个0-100的随机整数
		Random r=new Random();
		for (int i=0;i<5;i++) {
			System.out.print(r.nextInt(100)+"\t");
		}
		
		
	}

}
