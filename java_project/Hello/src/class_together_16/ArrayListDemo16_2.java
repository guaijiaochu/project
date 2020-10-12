package class_together_16;

import java.util.ArrayList;


/*
16_2
ensureCapacity()一次性增加数组容量，避免再分配，提高性能

Object ia[]=al.toArray();
深入理解List的toArray()方法和toArray(T[] a)方法
这两个方法都是将列表List中的元素转导出为数组，
不同的是，toArray()方法导出的是Object类型数组，
而toArray[T[] a]方法导出的是指定类型的数组。
*/

public class ArrayListDemo16_2 {

	public static void main(String[] args) {
		//创建一个arraylist对象
		ArrayList al=new ArrayList();
//		向arraylist添加内容
		al.add(new Integer(1));
		al.add(new Integer(2));
		al.add(new Integer(3));
		al.add(new Integer(4));
		System.out.println("数组内容："+al);
		
//		得到对象数组
		Object ia[]=al.toArray();
		int sum=0;
		
//		计算数组内容
		for (int i=0;i<ia.length;i++) {
			sum+=((Integer)ia[i]).intValue();
		}
		System.out.println("累加结果"+sum);
		


	}

}
