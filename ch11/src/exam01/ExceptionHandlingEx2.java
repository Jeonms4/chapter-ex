package exam01;

public class ExceptionHandlingEx2 {

	public static void main(String[] args) {
		String str1=null;
		
		int arr[] = new int[3];
		arr[0]=3;
		arr[1]=7;
		arr[2]=9;
		
		try {
			System.out.println(str1.length());
			System.out.println(arr[3]);
		}catch(NullPointerException | ArrayIndexOutOfBoundsException e) {
			System.out.println("예외가 남" + e.getMessage());
		}
		
		System.out.println("####");
	}

}
