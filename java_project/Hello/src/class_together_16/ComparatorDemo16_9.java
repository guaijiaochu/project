package class_together_16;

import java.util.*;

/*
	16_9定制的比较方法能力

*/
class MyComp implements Comparator{
	public int compare(Object o1,Object o2) {
		String aStr,bStr;
		aStr=(String) o1;
		bStr=(String) o2;
//		bStr调用方法导致结果逆向
		return bStr.compareTo(aStr);
	}
	
}

public class ComparatorDemo16_9 {

	public static void main(String[] args) {
//		创建一个treemap对象
		TreeSet ts =new TreeSet(new MyComp());
//		添加元素
		ts.add("C");
		ts.add("A");
		ts.add("B");
		ts.add("E");
		ts.add("F");
		ts.add("D");
		
//		得到Iterator的实例化对象
		Iterator i=ts.iterator();
		while (i.hasNext()) {
			Object element=i.next();
			System.out.print(element+" ");
		}

	}

}
