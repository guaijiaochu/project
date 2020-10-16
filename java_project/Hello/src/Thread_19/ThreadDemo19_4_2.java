package Thread_19;

/*
两种多线程机制的比较2:Thread
extends Thread时候，一个线程对象只能启动一次
这启动了4个线程对象，但是各占各的资源

因此使用Thread无法达到资源共享的目的

*/
public class ThreadDemo19_4_2 {

	public static void main(String[] args) {
		new TestRead19_4_2().start();
		new TestRead19_4_2().start();
		new TestRead19_4_2().start();
		new TestRead19_4_2().start();
	}

}

class TestRead19_4_2 extends Thread{
	private int tickets=20;
	public void run() {
			while(true) {
				if (tickets>0) {
					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
				}
			}
	}
}

