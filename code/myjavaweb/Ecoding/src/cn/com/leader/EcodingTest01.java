package cn.com.leader;


public class EcodingTest01 {
	public static void main(String[] args) throws Exception{
		String s="�й�";
		byte[] bs=s.getBytes("GB2312");// �������
		System.out.println(Utils.byte.ArrayToHex(bs));
	} 

	
	
}
