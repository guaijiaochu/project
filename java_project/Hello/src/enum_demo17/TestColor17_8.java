package enum_demo17;
//枚举关键字enum定义一个枚举类型
//Enum类中的ordinal()方法，输出枚举类型中每一个对象的编号，默认从0开始

import enum_demo17.TestColor17_4;

public class TestColor17_8 {

	public static void main(String[] args) {
		for(TestColor17_4 c:TestColor17_4.values()) {
			System.out.println(c.name()+"--->"+c.ordinal());
		}
		
	}

}
