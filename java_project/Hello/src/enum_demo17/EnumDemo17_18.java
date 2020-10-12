package enum_demo17;
//通过测试代码实现17_17
public class EnumDemo17_18{
	public static void main(String args[]) {
		for(EnumDemo17_17 c:EnumDemo17_17.values()) {
			System.out.println(c.ordinal()+"--->"+c.name()+":"+c.getColor());
			
		}
		
	}


}

