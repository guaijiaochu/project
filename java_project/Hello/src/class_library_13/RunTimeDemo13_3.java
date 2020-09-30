package class_library_13;

public class RunTimeDemo13_3 {

	public static void main(String[] args) {
		// Runtime类封装了java命令本身的运行进程,runtime类可以帮开发者执行操作系统的可执行程序
//		java进程与子进程进行交互
		Runtime run=Runtime.getRuntime();
		try {
			run.exec("notepad.exe");
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		
	}

}
