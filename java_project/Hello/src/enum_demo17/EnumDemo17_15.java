package enum_demo17;
//枚举的接口

//实现17_14接口
public enum EnumDemo17_15 implements EnumDemo17_14{
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
	
}

