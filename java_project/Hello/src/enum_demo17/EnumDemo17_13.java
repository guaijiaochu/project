package enum_demo17;
//枚举的构造方法
public enum EnumDemo17_13{
	RED("红色"),GREEN("绿色"),BLUE("蓝色");

	private String name;
	public String getName() {
		return name;
	}
	
	public void  setName(String name) {
		this.name=name;
	}
	
	EnumDemo17_13(String name) {
		this.setName(name);
	}
	
}

