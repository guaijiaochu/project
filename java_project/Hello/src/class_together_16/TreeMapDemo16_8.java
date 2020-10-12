package class_together_16;

import java.util.*;

/*
	16_8TreeMap类使用树实现Map接口，树映射保证它的元素按照关键字升序顺序

*/

public class TreeMapDemo16_8 {

	public static void main(String[] args) {
//		创建一个treemap对象
		TreeMap tm =new TreeMap();
//		添加元素
		tm.put(new  Integer(10000-2000),"张三");
		tm.put(new  Integer(10000-3000),"李四");
		tm.put(new  Integer(10000-4000),"王五");
		tm.put(new  Integer(10000-5000),"赵六");
		Collection col=tm.values();
		Iterator i=col.iterator();
		System.out.println("按照工资高到低顺序输出：");

		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
