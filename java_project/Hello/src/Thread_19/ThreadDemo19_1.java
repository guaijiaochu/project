package Thread_19;

/*想要运行main的循环，必须等TestRead的run方法运行完后才可以运行
如何激活多个线程：
（1）线程必须扩展自Thread类，使自己成为它的子类
（2）线程的处理必须编写在run()方法内*/

public class ThreadDemo19_1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new TestRead19_1().run();
		for (int i=0;i<10;i++) {
			System.out.println("main线程在运行");
		}
		
		
	}

}

class TestRead19_1{
	public void run() {
		for (int i=0;i<10;i++) {
			System.out.println("TestRead线程在运行");
		}
	}
}

