package hellopackage;

public class TypeConvert6_17 {

	public static void main(String[] args) {
//***表达式的类型转换
		/*
		 * 1、占用字节较少的数据类型转换成占用字节较多的数据类型 
		 * 2、字符类型会转换成int类型
		 * 3、int类型转换为float类型
		 * 4、表达式中某个操作数的类型是double，则另一个操作数的类型也会转换为double 
		 * 5、布尔类型 不能 转换成其他类型
		 */
		char ch = 'a' ;
		short a = -2;
		int b = 3;
		float f = 5.3f;
		double d =6.28;		
		System.out.println( "(ch/a)-(d/f)-(a+b)="  +  ((ch/a)-(d/f)-(a+b))   );//最终为double类型
		
		//Math.random()返回随机double值，该值介于0.0和1.0之间
		double zz = Math.random();
		System.out.println(zz);
		int zzz = (int)zz;
		System.out.println(zzz);
		
		
	}

}
