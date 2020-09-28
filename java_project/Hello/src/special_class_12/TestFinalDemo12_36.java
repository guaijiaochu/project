package special_class_12;

/*声明类、属性、方法时候可以用final修饰
1.final标记的类不能被继承
2.final标记的方法不能被子类覆写
3.final标记的变量为常量，只能赋值一次
4.final用于对象引用时，final使引用恒定不变。一旦引用被初始化指向一个对象，就无法再把它改为指向另一个对象。
如果引用为引用数据类型，比如对象、数组，则该对象、数组本身可以修改，但指向该对象或数组的地址的引用不能修改。*/


public class TestFinalDemo12_36 {

	public static void main(String[] args) {
		final int i = 10;
//		i++;

	}

}
