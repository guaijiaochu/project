package hellopackage;

public class ArrayDemo8_1 {

	public static void main(String[] args) {
//***一维数组的使用
//***使用12个月份的天数演示数组使用方法
//int x; 基本数据类型
//int[]x; 引用数据类型
		
//		定义长度为12的数组，并用12个月的天数初始化
		int[] month= {31,28,31,30,31,30,31,31,30,31,30,31};
		
		for (int i = 0; i < month.length; i++) {
//			输出第i月的天数
			System.out.println("第" + (i+1) + "月有" + month[i] + "天");
			
//			注意：数组的下标从0开始
			System.out.println(month[i]);
		}
		System.out.println("数组长度为："+month.length);

	}

}
