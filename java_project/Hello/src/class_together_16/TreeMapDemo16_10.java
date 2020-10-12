package class_together_16;

import java.util.*;
import java.util.Map.Entry;

/*
	16_10使用TreeMap程序实现存储账目资产平衡表
*/
class Employee implements Comparator{
	public int compare(Object a,Object b) {
		int k;
		String aStr,bStr;
		aStr=(String) a;
		bStr=(String) b;
		k=aStr.compareTo(bStr);
		if(k==0) {
			return aStr.compareTo(bStr);
		}
		else
			return k;
	}
	
}

public class TreeMapDemo16_10 {

	public static void main(String[] args) {
//		创建一个treemap对象
		TreeMap ts =new TreeMap(new Employee());
//		添加元素
		ts.put("Z、张三", new Double(1111));
		ts.put("L、李四", new Double(2222));
		ts.put("W、王五", new Double(3333));
		ts.put("Z、赵六", new Double(4444)); 	
		ts.put("S、孙七", new Double(5555));
		
		Set set=ts.entrySet();
		Iterator itr=set.iterator();
		
		while (itr.hasNext()) {
			Map.Entry me=(Entry) itr.next();
			System.out.print(me.getKey()+":");
			System.out.println(me.getValue());
		}
		System.out.println();
		double balance=((Double)ts.get("Z、张三")).doubleValue();
		ts.put("Z、张三", new Double(balance+2000));
		System.out.println("张三最新资金数："+ts.get("Z、张三"));
		


	}

}
