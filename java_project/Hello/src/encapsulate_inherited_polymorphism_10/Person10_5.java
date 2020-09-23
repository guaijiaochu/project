package encapsulate_inherited_polymorphism_10;
//类的继承
//java支持单继承和多层继承，不支持多继承。一个类最多只能继承一个类
//class 子类 extends 父类

class Person{
	int age;
	String name;
}

class Student extends Person{
	String school;
}


