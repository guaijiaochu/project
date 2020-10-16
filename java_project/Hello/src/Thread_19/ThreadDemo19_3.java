package Thread_19;

/*
通过Runnable接口实现多线程
因为java只允许单一继承、如果类继承了某个类又想使用多线程，就不能通过继承Thread，而是通过Runnable接口实现多线程

*/


public class ThreadDemo19_3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TestRead19_3 t=new TestRead19_3();
		new Thread(t).start();;
		for (int i=0;i<10;i++) {
			System.out.println("main线程在运行");
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	
	}

}

class TestRead19_3 implements Runnable{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("TestRead线程在运行");
			
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}
	}
}

