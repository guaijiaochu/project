package encapsulate_inherited_polymorphism_10;

public class TestPersonDemo10_2 {

//在10_1中对象直接访问了类的属性，在面向对象中是不允许的。因此需要对类的属性进行封装private，如10_2
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Person10_2 p = new Person10_2(); //实例化对象p
		
//		在对类的属性进行封装（私有化） 后，  此处的对象访问不到类的属性
//		因此需要对类增加setXxx()getXxx()的共有方法为对象赋值
		
		
//		p.name = "张三";
//		p.age = -25;
		p.talk();
				
	}

}
