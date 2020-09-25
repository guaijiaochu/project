package encapsulate_inherited_polymorphism_10;

public class TestPersonStudentDemo10_7{
	public static void main(String[] args) {
		Student10_7 s = new Student10_7();
		s.school = "北京";
		System.out.println("姓名："+s.name+",年龄:"+s.age+"，学校:"+s.school);
	}
}