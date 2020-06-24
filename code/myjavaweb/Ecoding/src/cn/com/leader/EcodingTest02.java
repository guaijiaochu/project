package cn.com.leader;

public class EcodingTest02 {
	public static void main(String[] args) throws Exception{
		byte[] bs={(byte)0xD6,(byte)0XD0,(byte)(byte)0XB9,(byte)0XFA};
		String s=new String(bs,"GBK");
		System.out.println(s);
	} 

	
	
}
