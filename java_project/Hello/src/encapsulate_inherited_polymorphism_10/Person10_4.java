package encapsulate_inherited_polymorphism_10;
//方法的封装
public class Person10_4 {
	private String name;
	private int age;
	
	//	此处对方法进行了封装
	private void talk()
	{
		System.out.println("我是"+name+"今年"+age+"岁");
		
	}
	
	public void setName(String Str) {
		name = Str;
	}
	
	public void setAge(int a ) {
		if (a>0) {
			age = a;
		}
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
}






