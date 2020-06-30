package use_class_package9;
//在类的内部调用方法
class Person9_15{
	private String name;
	private int age;
	private void talk() {
		System.out.println("我是："  +name + ",今年" +age+ "岁");
	}
	public void say() {
		talk();
	}
	public 	void setName(String str) {
		name = str;
	}
	public 	void setAge(int a ) {
		if (a >0) {
			age = a ;
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
}


public class PersonTestDemo9_15 {

	public static void main(String[] args) {
		Person9_15 p= new Person9_15();
		p.setName("张三");
		p.setAge(25);
		p.say();

	}

}
