package encapsulate_inherited_polymorphism_10;

public class TestPersonDemo10_3 {

//	类封装后，通过get set 这种共有方法对对象赋值
	public static void main(String[] args) {

		Person10_3 p = new Person10_3(); //实例化对象p
		p.setName("李四");  //给p的属性赋值
		p.setAge(-25);//此处赋值不合理，因此age赋默认值0
		
		
		
		p.talk();
				
	}

}
