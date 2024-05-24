package exam01;

public class ThrowEx {

	public static void main(String[] args) throws ClassNotFoundException {
		// 앞으로 클래스 명을 찾는 경우 문자열로 넣는 경우 패키지명.클래스명까지 해야 정확하게 클래스명을 인식합니다.
//		try {
//			//Class.forName("String");
//			Class.forName("java.lang.String");
//			System.out.println(obj);
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("hi");
		
		Class obj = Class.forName("java.lang.String");
		System.out.println(obj);
		
	}
	
	static void findClass() {
		
	}

}
