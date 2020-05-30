package hellopackage_basic;

//导入输入输出流包
//BufferedReader是为了提供读的效率而设计的一个包装类，它可以包装字符流。可以从字符输入流中读取文本，缓冲各个字符，从而实现字符、数组和行的高效读取。
import java.io.BufferedReader;
//API文档说明：InputStreamReader类是从字节流到字符流的桥接器：它使用指定的字符集读取字节并将它们解码为字符。 它使用的字符集可以通过名称指定，也可以明确指定，或者可以接受平台的默认字符集。每次调用一个InputStreamReader的read（）方法都可能导致从底层字节输入流中读取一个或多个字节。 为了实现字节到字符的有效转换，可以从基础流中提取比满足当前读取操作所需的更多字节。为了获得最高效率，请考虑在BufferedReader中包装InputStreamReader

import java.io.InputStreamReader;


public class StreamlnTest3_3 {
//***P74范例3-3：简单的输入输出流使用范例
	
	
	public static void main(String[] args) {
		String str;
		
		//创建标准输入流对象stdin来接收键盘System.in的输入
		InputStreamReader stdin = new InputStreamReader(System.in);
//		以缓冲流模式来接收stdin
		BufferedReader bufin = new BufferedReader(stdin);
//		使用try和catch机制来处理输入的异常
		try {
			System.out.print("请输入字符： ");
//			用str字符串对象接收键盘输入的一行数据
			str=bufin.readLine();
			System.out.println("你输入的字符为："+ str);
		}
		catch(Exception e){
			System.out.println("发生IO错误！！！");
			e.printStackTrace();
		}
	}

}
