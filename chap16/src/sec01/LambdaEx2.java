package sec01;

public class LambdaEx2 {

	static void action(Calculable calculable) {
		System.out.println("hi");
		
		int x = 10;
		int y = 4;
		
		calculable.calculate(x, y);
	}
	
	public static void main(String[] args) {
		action(
				(x,y) -> {
					System.out.println(x + y);
				}
				);
	}

}
