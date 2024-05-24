package exam01;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		String str1=null;
		
		//System.out.println(str1.length());
		
		//예외 처리
		//예외가 날 경우, 안날 경우
		try {
			//str1="hi";
			System.out.println(str1.length());
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println("null이 안되도록 하세요.");
			System.out.println(e);
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("무조건 하라");
		}
	}

}
