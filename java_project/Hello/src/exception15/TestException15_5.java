package exception15;

class Test15_5 {
	
//	15_5在指定方法抛出异常
	void add(int a ,int b)throws Exception {
		int c;
		c=a/b;
		System.out.println(a+"/"+b+"="+c);			
	}
}
	
public class TestException15_5{
	public static void main(String[] args) {
		Test15_5 t = new Test15_5();

		try {	
			t.add(4, 0) ;	
		} 
		catch (Exception e) {
			System.err.println("这个异常是："+e);
		}

		
	}		
}

