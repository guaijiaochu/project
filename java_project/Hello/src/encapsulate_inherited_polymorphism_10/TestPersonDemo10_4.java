package encapsulate_inherited_polymorphism_10;

public class TestPersonDemo10_4 {
	//方法的封装
	public static void main(String[] args) {

		Person10_4 p = new Person10_4(); //实例化对象p
		p.setName("李四");  //给p的属性赋值
		p.setAge(-25);//此处赋值不合理，因此age赋默认值0
		
		
		//由于方法进行了封装，因此这里访问不到
//		p.talk();
				
	}

}
