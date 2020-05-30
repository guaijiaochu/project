package hellopackage_basic;

public class forDemo7_6_2 {

	public static void main(String[] args) {
//***for循环的嵌套使用
		for (int i = 1; i < 10; ++i) {
//			输出i*1到i*i的乘积
			for (int j = 1;j<=i;++j) {
				System.out.print(i + "*" + j + "=" + (i*j) +"\t");
			}
			System.out.println("");
		}
		return;
//		System.out.println("执行结束");
	}
}
//return语句可以使程序的流程离开return语句所在的方法，
//return 返回值;
//其中返回值根据方法的定义的不同以及我们的需求不同而不同
//return后的语句不再执行