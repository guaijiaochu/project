package enum_demo17;
//枚举中定义抽象方法，每个对象必须单独实现此方法

public enum EnumDemo17_17{
	Red{
		public String getColor() {
			return "红";
		}		
	},
	
	Green{
		public String getColor() {
			return "绿";
		}		
	},
	
	Blue{
		public String getColor() {
			return "蓝";
		}		
	};
	
	public abstract String getColor();
}

