package exception15;

public class TestException15_3 {

//	15_3异常处理
	public static void main(String[] args) {
		try {
			int arr[]=new int[5];
			arr[10]=7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("数组超范围");
			System.err.println("异常是："+e);
		}
		finally {
			System.out.println("finally一定执行");
		}
		
		
	}

}
