package class_library_13;
/*
java类库就是java API（应用程序接口），是系统提供的已实现的标准类的集合。
使用java类库可以完成设计字符串处理、图形、网络等多方面的操作。
*/

/*String类和StringBuffer类：封装字符串的操作。
 他们被放到了java.long包中，不需要用import java.long语句导入就可以直接使用

String类用于比较两个字符串，查找和抽取串中的字符和字串，进行字符串和其他类型之间的相互转换。String类对象的内容初始化后不可改变。
StringBuffer类用于内容可以改变的字符串，可以将其他各种类型的数据增加、插入到字符串中，也可转置字符串中原来的内容。
	一旦通过StringBuffer生成了最终想要的字符串，就应该用StringBuffer.toString()方法将其转换成string类，随后可以使用String的方法操作该字符串。
若频繁改变字符串内容用StringBuffer

String x="a"+"4"+"c";
等价于
String x=new StringBuffer().append("a").append("4").append("c").toString();

*/

public class IntergerDemo13_1 {
//	java的很多方法的参数类型为Object（即接受的参数是对象），但要用这些方法处理基本类型的数据，此时用包装类
	public static void main(String[] args) {
		String a = "123";
//		Integer.parseInt(a)将一个字符串转换成基本类型
		int i=Integer.parseInt(a);
		i++;
		System.out.println(i);
	}
	

}
