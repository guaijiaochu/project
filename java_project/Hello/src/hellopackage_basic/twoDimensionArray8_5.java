package hellopackage_basic;

public class twoDimensionArray8_5 {

	public static void main(String[] args) {
//***二维数组的使用，静态赋值
		int sum = 0;
		int [][]num= {
				{30,35,26,32},
				{33,34,30,29}
		}; //声明数组并设置初值
		
		for (int i = 0; i < num.length; i++) { //输出销售量并计算销售总量
			System.out.println("第" + (i+1) + "个人的成绩为：");
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j]+"\t");
				sum+=num[i][j];
			}
			System.out.println();
		}
		System.out.println("总成绩是" + sum + "分！");

	}

}
