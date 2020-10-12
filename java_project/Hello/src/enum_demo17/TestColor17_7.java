package enum_demo17;
//枚举类中的values()方法得到枚举中各对象的取值范围
import enum_demo17.TestColor17_4;

public class TestColor17_7 {

	public static void main(String[] args) {
		for(TestColor17_4 c:TestColor17_4.values()) {
			System.out.println(c);
		}
		
	}

}
