package Thread_19;

/*
两种多线程机制的比较1:Thread
extends Thread时候，一个线程对象只能启动一次
*/
public class ThreadDemo19_4_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		TestRead19_4_1 t=new TestRead19_4_1();
		t.start();//一个线程对象只能启动一次
		t.start();//一个线程对象只能启动一次
		t.start();//一个线程对象只能启动一次
		t.start();//一个线程对象只能启动一次
	}

}

class TestRead19_4_1 extends Thread{
	private int tickets=20;
	public void run() {
			while(true) {
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
				}
			}
	}
}

