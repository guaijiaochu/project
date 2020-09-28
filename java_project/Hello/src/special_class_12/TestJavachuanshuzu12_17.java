package special_class_12;

//将数组传递到方法中

public class TestJavachuanshuzu12_17 {

	public static void main(String[] args) {
		int score[]= {2,3,5,6,7,8,9};
//		将数组score传递到largest()方法中
		largest (score);
	}
	
	
	public static void largest(int arr[]) {
		int tmp=arr[0];	
		for (int i = 0;i<arr.length;i++) {
			if (tmp<arr[i]) {
				tmp=arr[i];
			}
		}
			System.out.println("最大的数"+tmp);
		
		
	}

}
