package exception15;

public class TestException15_4 {

//	15_4在程序中抛出异常throw
	public static void main(String[] args) {
		int a=4,b=0;
		
		try {
			if (b==0) {
				throw new ArithmeticException("这有一个算术异常");
			}
			else {
				System.out.println(a+"/"+b +"="+ a/b);
			}
		
		} catch (ArithmeticException e) {
			System.err.println("异常是："+e);
		}

		
		
	}

}
