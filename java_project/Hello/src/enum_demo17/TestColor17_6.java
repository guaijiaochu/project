package enum_demo17;
//switch中用枚举
import enum_demo17.TestColor17_4;

public class TestColor17_6 {

	public static void main(String[] args) {
		switch(TestColor17_4.Green) {
		case Red:{
			System.out.println("红色");
			break;
		}
		
		case Green:{
			System.out.println("绿色");
			break;
		}
		
		case Blue:{
			System.out.println("蓝色");
			break;
		}
		
		
		
		}

	}

}
