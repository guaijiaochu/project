package Thread_19;

/*
两种多线程机制的比较3:Runnable


*/
public class ThreadDemo19_4_3 {

	public static void main(String[] args) {
		TestRead19_4_3 t=new TestRead19_4_3();
//		启动了4个线程，并且实现了资源共享
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}

}

class TestRead19_4_3  implements Runnable{
	private int tickets=20;
	public void run() {
			while(true) {
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
					try {
						Thread.sleep(2);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
				}
			}
	}
}

