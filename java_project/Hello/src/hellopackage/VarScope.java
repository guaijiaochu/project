package hellopackage;

public class VarScope {
//	Java中类与方法的变量作用域可嵌套，可以把整个类看做是一个大的作用域，它定义的字段可被方法中的同名字段所屏蔽
//	但是方法中不允许有同名变量，不允许作用域嵌套
	
	public static void main(String[] args) {
		int x =1;
		System.out.println("x="+x);
		
	}
	private int x; //被第8行的x覆盖
}
