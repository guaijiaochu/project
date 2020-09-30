package class_library_13;

public class CloneDemo13_8 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Employee e1=new Employee("张三", 22);
		Employee e2=null;
		try {
			e2=(Employee)e1.clone();
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		
		e2.setName("李四");
		e2.setAge(23);
		
		System.out.println("两个对象的内存地址比较："+(e1==e2));
		System.out.println(e1);
		System.out.println(e2);
	}

}
