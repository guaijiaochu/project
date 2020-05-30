package hellopackage_basic;

public class datetype5_1 {
	public static void main(String[] args) {
//***byte类型数据的使用
		byte byte_max=Byte.MAX_VALUE;//得到Byte型最大值
		System.out.println("BYTE的最大值"+byte_max);
		
		short short_max=Short.MAX_VALUE;
		System.out.println("SHORT的最大值"+short_max);
		
		
//		数据溢出：最大值最小值出现循环过程
		int int_max = Integer.MAX_VALUE;
		int int_min = Integer.MIN_VALUE;
		System.out.println("最大值："+int_max);
		System.out.println("最小值："+int_min);
		System.out.println(int_max+1 + "最大值加1变为最小值");
		System.out.println(int_min-1 + "最小值减一变为最大值");
		
//		进行强制类型转换，避免数据溢出
		System.out.println("进行强制类型转换，避免数据溢出");
		System.out.println(int_max+ (long)1 + "最大值加1");
		System.out.println(int_min-1L + "最小值减一");
		
		
//		含小数点的实数默认为double类型数据
		float float_num = (float)3.0f;//强制类型转换为float
		System.out.println("3*3="+ (float_num*float_num) );
				
		
//		布尔类型只有真假两种true/false
		boolean Zhangsan_sex_is_man = false;
		System.out.println("张三是男的吗:"+ Zhangsan_sex_is_man);
		
		
		
		
		
	}
}
