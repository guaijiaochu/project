package class_together_16;

import java.util.ArrayList;


/*16_1arraylist支持可随需要而增长的动态数组
ArrayList al=new ArrayList();
al.add("C")
al.remove("F")
*/

public class ArrayListDemo16_1 {

	public static void main(String[] args) {
		//创建一个arraylist对象
		ArrayList al=new ArrayList();
		System.out.println("a1的初始化大小："+al.size());
		
//		向arraylist添加内容
		al.add("C");//0位置
		al.add("A");//1位置
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
//		把A2加在arraylist对象的第2个位置
		al.add(1,"A2");
		System.out.println("加入元素后的大小："+al.size());//加入元素后的大小
		
		System.out.println("al的内容"+al);
		
//		从arraylist移除数据
		al.remove("F");
		al.remove(2);
		System.out.println("删除元素后的大小"+al.size());
		System.out.println("al内容"+al);

	}

}
