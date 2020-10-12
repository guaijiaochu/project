package class_together_16;

import java.util.*;

/*
16_6通过迭代方法访问类集
Iterator是一个接口，它是集合的迭代器。集合可以通过Iterator去遍历集合中的元素。
hasNext()：如果迭代器中还有元素，则返回true。
next()：返回迭代器中的下一个元素
remove()：删除迭代器新返回的元素。

ListIterator是一个功能更加强大的, 它继承于Iterator接口,只能用于各种List类型的访问。
可以通过调用listIterator()方法产生一个指向List开始处的ListIterator,
 还可以调用listIterator(n)方法创建一个一开始就指向列表索引为n的元素处的ListIterator。
ListIterator可以:

(1)双向移动（向前/向后遍历）.
(2)产生相对于迭代器在列表中指向的当前位置的前一个和后一个元素的索引.
(3)可以使用set()方法替换它访问过的最后一个元素.
(4)可以使用add()方法在next()方法返回的元素之前或previous()方法返回的元素之后插入一个元素.

Iterator和ListIterator区别
我们在使用List，Set的时候，为了实现对其数据的遍历，我们经常使用到了Iterator(迭代器)。
使用迭代器，你不需要干涉其遍历的过程，只需要每次取出一个你想要的数据进行处理就可以了。
但是在使用的时候也是有不同的。List和Set都有iterator()来取得其迭代器。
对List来说，你也可以通过listIterator()取得其迭代器，两
种迭代器在有些时候是不能通用的，Iterator和ListIterator主要区别在以下方面：
（1）ListIterator有add()方法，可以向List中添加对象，而Iterator不能
（2）ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator就不可以。
（3）ListIterator可以定位当前的索引位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
（4）都可实现删除对象，但是ListIterator可以实现对象的修改，set()方法可以实现。Iierator仅能遍历，不能修改。
（5）ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和 previous()方法实现逆向（顺序向前遍历）
*/

public class IteratorDemo16_6 {

	public static void main(String[] args) {
//		创建一个arraylist数组
		ArrayList al =new ArrayList();
//		添加元素
		al.add("C");
		al.add("A");
		al.add("E");
		al.add("B");
		al.add("D");
		al.add("F");
		
//		使用Iterator显示al的内容
		System.out.println("al的原始内容是");
		Iterator itr=al.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
////		在ListIterator中修改内容
		ListIterator litr = al.listIterator();
		while (litr.hasNext()) {
			Object element=litr.next();
//			用set方法修改其内容
			litr.set(element+"+");
		}
//		
		System.out.println("al修改后的内容：");
		itr=al.iterator();
		while(itr.hasNext()) {
			Object element=itr.next();
			System.out.print(element+" ");
		}
		System.out.println();
		
//		下面是将列表内容反向输出
		System.out.println("将列表反向输出");
//		hasPreviours由后向前输出
		while(litr.hasPrevious()) {
			Object element=litr.previous();
			System.out.print(element+" ");
		}
		System.out.println();
		
	}

}
