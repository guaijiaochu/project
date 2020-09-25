package encapsulate_inherited_polymorphism_10;
//10_11子类覆写父类


class Person10_11{
	 String name;
	 int age;
	 
	 public String talk() {
		 return "我是："+this.name+",今年："+age+"岁";
	 }
}

class Student10_11 extends Person10_11{
	String school;
	public Student10_11(String name,int age,String school) {
		//		分别为属性赋值
		this.name = name;
		this.age = age;
		this.school = school;
	}
	
	//	此处覆写Person中的talk()方法
	public String talk() {
		return super.talk()+",我在"+this.school+"上学";//和10_10此处不同
	}
}



