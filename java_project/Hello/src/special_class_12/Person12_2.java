package special_class_12;

/*object类的使用
obiect类是所有类的 父类，若一个类未用extends表明继承另一个类，那么它默认继承object。
object 是最高层类，object中的方法适用于所有类
*/
public class Person12_2 extends Object {
	String name = "张三"; 
	int age = 25;
	
//	明确覆写了toString方法
	public String toString() {
		return "我是"+this.name+"今年"+this.age+"岁";
	}
}
