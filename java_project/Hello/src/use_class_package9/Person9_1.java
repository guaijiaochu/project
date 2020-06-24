/**
 * 
 */
package use_class_package9;
/**
 * @author zsj
 *封装：封装是一种信息隐蔽技术，它体现于类的说明，是对象的重要特性。
 *封装的目的在于把对象设计者和对象的使用者分开，使用者不必知晓其行为实现的细节，只须用设计者提供的消息来访问该对象
 *
 *继承：继承性是子类共享其父类数据的方法和机制
 *
 *多态：对象根据所接受的消息而做出动作。同一消息被不同的对象接受时可产生完全不同的行动，这种现象成为多态。
 *
 */
public class Person9_1 {
//	类的组成使用
		String name;
		int age;
		void talk() 
		{
			System.out.println("我是：" +name+ ",今年" +age+ "岁");
			}

	}
//public static void main(String[] args) {
	// TODO 自动生成的方法存根
//}
