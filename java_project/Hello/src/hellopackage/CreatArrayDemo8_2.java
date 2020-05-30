package hellopackage;

public class CreatArrayDemo8_2 {

	public static void main(String[] args) {
//***创建一个数组，并输出其默认初试值
		int[] a=null;
		a = new int[3];//开辟内存空间供整型数组a使用，其元素个数为3
		
		System.out.println("数组的长度是"+a.length);//输出数组长度
		
		for (int  i= 0;  i< a.length; ++i) {
			System.out.println("a["+i+"]="+a[i]);//整型数组默认数据为0
		}
		
		
		
	}

}
