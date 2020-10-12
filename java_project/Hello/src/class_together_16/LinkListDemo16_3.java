package class_together_16;

import java.util.*;

/*
16_3LinkedList提供了链接列表的数据结构
	ll.add("F");
	ll.addLast("3");
	ll.remove(2);
	//		取得并设值
	Object val=ll.get(2);
	ll.set(2,(String)val+"改");			
*/

public class LinkListDemo16_3 {

	public static void main(String[] args) {
//		创建对象
		LinkedList ll =new LinkedList();
		ll.add("F");
		ll.add("B");
		ll.add("D");
		ll.add("E");
		System.out.println("初始"+ll);
		ll.addLast("3");
		System.out.println("尾部+3"+ll);
		ll.addFirst("q");
		System.out.println("头部+q"+ll);
		
		ll.remove(2);
		System.out.println("移除第3个"+ll);
		
//		取得并设值
		Object val=ll.get(2);
		ll.set(2,(String)val+"改");
		System.out.println("第3个位置加“改”。最终结果"+ll);
		
		
	}

}
