package encapsulate_inherited_polymorphism_10;
//类的封装
public class Person10_3 {
	private String name;
	private int age;
	
	void talk()
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






