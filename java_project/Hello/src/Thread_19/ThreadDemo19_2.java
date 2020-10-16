package Thread_19;

/*通过继承Thread类实现多线程

与19_1相比
继承了extends Thread类
调用的不是run()方法，而是start()方法。new TestRead19_2().start();

你需要调用Thread对象的start()方法来启动线程。调用run()就变成你当前线程亲自执行了。

没有出现两个线程交替运行
这是因为在一个cpu 时间片里就可以把你这10次循环都给运行完。你加一个sleep 等一段时间在看
*/


public class ThreadDemo19_2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestRead19_2().start();;
		for (int i=0;i<10;i++) {
			System.out.println("main线程在运行");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	
	}

}

class TestRead19_2 extends Thread{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("TestRead线程在运行");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}

