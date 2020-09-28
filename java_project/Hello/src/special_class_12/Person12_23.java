package special_class_12;

/*
equals方法的覆写
*/
public class Person12_23  {
	private String name ; 
	private int age;
	public Person12_23(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
//	覆写父类中 的equals方法
	public boolean euqals(Object o)
	{
		boolean temp = true;
		Person12_23 p1 = this;
		if (o instanceof Person12_23) {
			Person12_23 p2= (Person12_23)o;
			if(!(p1.name.equals(p2.name)&&p1.age==p2.age)) {
				temp=true;
			}
		}
		else {
			temp = false;
		}
		return temp;
	}
}




	