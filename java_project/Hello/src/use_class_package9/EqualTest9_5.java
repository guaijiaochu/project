package use_class_package9;

public class EqualTest9_5 {
//equal方法用于对象比较
	public static void main(String[] args) {
		String str1 = new String("java");
		String str2 = new String("java");
		String str3 = str2;
		if (str1.equals(str2)){
			System.out.println("str1 equals str2");
		}
		else {
			System.out.println("str1 not equals str2");
		}
		
		if (str3.equals(str2)){
			System.out.println("str3 equals str2");
		}
		else {
			System.out.println("str3 not equals str2");
		}

	}

}
