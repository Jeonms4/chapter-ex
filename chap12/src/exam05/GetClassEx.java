package exam05;

public class GetClassEx {

	public static void main(String[] args) {
		// Class 객체 정보 얻는 방법
		// 1. 클래스명.class
		
		System.out.println(Car.class);
		
		// 2. Class.forName("패키지명, 클래스명");
		
		try {
			Class cls = Class.forName("exam05.Car");
			System.out.println("####");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("해당 클래스 없음");
		}

	}

}
