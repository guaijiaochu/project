package exception15;
//15_6定义自己的异常类
//java可通过继承的方式定义自己的异常类，因为所有可处理的异常继承自Exception类，自定义类也必须继承Exception类

public class TestException15_6{
	public static void main(String[] args) {

		try {	
			throw new DefaultException15_6("自定义异常");
		} 
		catch (Exception e) {
			System.err.println("这个异常是："+e);
		}

		
	}		
}

