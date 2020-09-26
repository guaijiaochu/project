package abstract_interface_11;

//接口的继承
interface A{
	int i = 10;
	public 	void sayI();	
}

interface E{
	int x = 40;
	public 	void sayE();	
}

//B同时继承了AE两个接口
interface B extends A,E{
	int j = 20;
	public 	void sayJ();	
}

class C implements B{
	public 	void sayI() {
		System.out.println("I="+i);
	}	
	public 	void sayE() {
		System.out.println("E="+x);
	}	
	public 	void sayJ() {
		System.out.println("J="+j);
	}	
	
}
