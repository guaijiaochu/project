package special_class_12;

public class TestInterface12_25 {

	public static void main(String[] args) {
//		利用computer类的实例化对象调用work方法
		new computer().work(new MoveDisk());
		new computer().work(new MP3());
	}

}
