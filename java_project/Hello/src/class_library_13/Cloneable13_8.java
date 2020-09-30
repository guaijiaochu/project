package class_library_13;

/*对象克隆
所有clone功能的类都实现了java.long.Cloneable接口*/


class Employee implements   Cloneable {
	private String name;
	private int age;
	public 	Employee (String name ,int age) {
		this.name=name;
		this.age=age;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
	public String toString() {
		return "姓名:"+this.name+",年龄:"+this.age;
	}
	
	public int getAge(){
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	
}
