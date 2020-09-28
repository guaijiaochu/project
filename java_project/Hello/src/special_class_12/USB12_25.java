package special_class_12;

//接口对象的实例化使用

//声明一个USB接口，此接口有2个抽象方法
public interface USB12_25 {
	public void start();
	public void stop();
}

//MoveDisk类实现了usb接口，覆写了2个方法
class MoveDisk implements USB12_25{
	public void start() {
		System.out.println("MoveDisk start");
	}
	
	public void stop() {
		System.out.println("MoveDisk stop");
	}
}

class MP3 implements USB12_25{
	public void start() {
		System.out.println("MP3 start");
	}
	
	public void stop() {
		System.out.println("MP3 stop");
	}
}



class computer{
//	此方法接收usb对象的实例
	public void work(USB12_25 u) {
		u.start();
		u.stop();
	}
}




