package hellopackage;

public class arrayMaxMin8_4 {

	public static void main(String[] args) {
//***求数组中的最大值和最小值
		
		int[]a= {74,25,33,88,56,9};//声明数组a并赋初值
		int max = a[0];		//储存最大元素，假设第一个元素最大
		int min = a[0];		//储存最小元素，假设第一个元素最小
		System.out.println("数组a的元素包括:");

		for (int i = 0; i < a.length; ++i) {
			System.out.print(a[i]+"\t");
				if (a[i]>max) {
					max = a[i];
				} else if (a[i]<min) {
					min = a[i];
				} 
				else {
					
				}
		}
		System.out.print("\n数组的最大值是："+max);
		System.out.print("\n数组的最小值是："+min);
	
		
	}

}
