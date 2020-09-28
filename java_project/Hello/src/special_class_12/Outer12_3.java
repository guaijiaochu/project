/*
 * package special_class_12;
 * 
 * 内部类，会破坏程序结构，开发中不建议使用
 * 
 * 内部类访问外部类声明的属性，反之不可以
 * 
 * 
 * public class Outer12_3 { int score = 95; void inst() { Inner in = new Inner;
 * in.display();
 * 
 * class Inner{ void display() { System.out.println("成绩："+score); } }
 * 
 * 
 * 
 * }
 * 
 * }
 */