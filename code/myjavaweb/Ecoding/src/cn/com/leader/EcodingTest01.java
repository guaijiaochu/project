package cn.com.leader;


public class EcodingTest01 {
	public static void main(String[] args) throws Exception{
		String s="中国";
		byte[] bs=s.getBytes("GB2312");// 编码过程
		System.out.println(Utils.byte.ArrayToHex(bs));
	} 

	
	
}
