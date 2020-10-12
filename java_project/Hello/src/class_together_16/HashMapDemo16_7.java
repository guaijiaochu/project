package class_together_16;

import java.util.*;

/*
16_7HashMap类使用散列表实现Map接口，散列映射不保证元素顺序
Entry
由于Map中存放的元素均为键值对，故每一个键值对必然存在一个映射关系。 
Map中采用Entry内部类来表示一个映射项，映射项包含Key和Value (我们总说键值对键值对, 每一个键值对也就是一个Entry)
Map.Entry里面包含getKey()和getValue()方法
*/

public class HashMapDemo16_7 {

	public static void main(String[] args) {
//		创建一个hashmap对象
		HashMap hm =new HashMap();
//		添加元素
		hm.put("B", new Double(111.1));
		hm.put("A", new Double(222.2));
		hm.put("C", new Double(333.3));
		hm.put("F", new Double(444.4));
		hm.put("E", new Double(555.5));
//		返回包含映射中项的集合
		Set set=hm.entrySet();
		
//		使用Iterator得到hashmap的内容
		Iterator i=set.iterator();
		
//		显示元素
		while(i.hasNext()) {
//			Map.Entry可以操作映射的输入
			Map.Entry me=(Map.Entry)i.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		
////	A的值增加1000	
		double balance=((Double)hm.get("A")).doubleValue();
		
//		新值替换旧值
		hm.put("A", new Double(balance +1000));
		System.out.println("A现在的资金："+hm.get("A"));
		
	}

}
