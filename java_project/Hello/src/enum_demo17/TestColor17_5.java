package enum_demo17;

/*1、一周有多少天？
7天。像这样固定不变的一组数据，如果我们的程序有需要用到这“7天”的相关信息，例如：发工资分为工作日和周末，可以考虑使用枚举类型。
2、太阳系有多少个行星？
8个。当我们需要计算每个行星的表面重力的时候，像这样我们需要用到固定不变的一组信息中的每一个元素携带了不同的信息，可以考虑使用枚举类型。 
3、计算器中的基础运算符。
 加减乘除。像这样我们需要用到固定不变的一组信息中的每一个元素都决定了不同的行为的时候，可以考虑使用枚举类型。
4、web请求返回的状态。
比如：error为-1，success为0，未登录为-9等可以设为枚举类型*/

import enum_demo17.TestColor17_4;

public class TestColor17_5 {

	public static void main(String[] args) {
		TestColor17_4 c = TestColor17_4.Red;
		System.out.println(c);

	}

}
