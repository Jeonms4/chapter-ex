package sec02;

public class Test1 {
	public static void main(String[] args) {
		Person kim = new Person();
//		kim.useComputer(new Calculable() {
//			
//			@Override
//			public double calc(double x, double y) {
//				return 0;
//			}
//		});
		
		//2) 람다식
//		kim.useComputer(
//				(a,b) -> {
//					return a+b;
//				}
//				);
		
		// 정적 메소드 참조
		kim.useComputer(Computer::add);
		
		Computer com1 = new Computer();
		
		// 인스턴스 메소드 참조
		kim.useComputer(com1::add2);
	}
}
