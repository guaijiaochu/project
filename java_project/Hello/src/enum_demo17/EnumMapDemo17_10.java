package enum_demo17;
//EnumMap是Map的子类，可调用EnumMap实现对对象的控制
//

import java.util.EnumMap;
import java.util.Map;
import java.util.Map.Entry;

import enum_demo17.TestColor17_4;

public class EnumMapDemo17_10 {

	public static void main(String[] args) {
		EnumMap<TestColor17_4, String> eMap=new EnumMap<TestColor17_4, String>(TestColor17_4.class);
		eMap.put(TestColor17_4.Red,"红");
		eMap.put(TestColor17_4.Green,"绿");
		eMap.put(TestColor17_4.Blue,"蓝");
		
		for (Entry<TestColor17_4, String> me:eMap.entrySet()) {
			System.out.println(me.getKey()+"---->"+me.getValue());
		}
		}
		
}


