package sec02;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrToStreamEx {
	static int tot = 0;
	public static void main(String args[]) {
		String strArr[] = { "홍길동", "홍이동", "홍삼동" };
		
		int strArr2[] = {4, 6, 8};

//		for (String str : strArr) {
//			System.out.println(str);
//		}
		
		System.out.println("=================");
		
//		Stream<String> stream = Arrays.stream(strArr);
//		stream.forEach((x)->{System.out.println(x);});
		
		IntStream stream2 = Arrays.stream(strArr2);
		stream2.forEach((x)->{System.out.println(x);});
		
		IntStream stream3 = IntStream.rangeClosed(1, 100);
		System.out.println(stream3);
		
		IntStream stream4 = IntStream.rangeClosed(1, 10);
		
		stream3.forEach((x) -> {
			tot += x;
			System.out.println(x);
		});
		System.out.println(tot);
		
		System.out.println(stream4.sum());
	}
}
