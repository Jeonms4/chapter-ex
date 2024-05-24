package sec01;

public class PersonTest {

	public static void main(String[] args) {
		Person p1 = new Person();
		// 1) 매개변수 X, return X
//		p1.action(
//				() -> {
//					System.out.println("출근 후 코딩");
//				}
//				
//				);
		
		// 2) 매개 변수 O, return x
//		p1.action(
//				(gift) -> {
//					System.out.println(gift);
//				}
//				);
		
		// 3) 매개 변수 X, return O
//		p1.action(
//				() -> {
//					return "초콜릿";
//				}
//				);
		// 4) 매개 변수 O, return O
		p1.action(
				(x) -> {
					return "탕후루";
				}
				);
		
	}
}
