package encapsulate_inherited_polymorphism_10;

public class TestPersonStudentDemo10_5 {
	//类的继承
	public static void main(String[] args) {

		Student10_5 s = new Student10_5();
		s.name = "张三";
		s.age=25;
		s.school = "北京";
		System.out.println("我是"+s.name+"，\n今年"+s.age+"岁，\n学校:"+s.school);
		
				
	}

}
