package sec03;

public class Person {
	void ordering(Comparable comparable) {
//		int result = comparable.compare(2, 3);
		int result = comparable.compare("hi", "hello");
		
		System.out.println(result);
	}
}
