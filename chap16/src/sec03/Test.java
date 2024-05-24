package sec03;

public class Test {

	public static void main(String[] args) {
		Person p1 = new Person();
		
//		p1.ordering(
//				(num1, num2) -> {
//					return num1+num2; 
//				}
//				);
		
		// 매개변수의 (a의 타입이 문자열이므로) 문자열 메소드 참조할 수 있다
		p1.ordering(
				String::compareToIgnoreCase
				);
	}

}
