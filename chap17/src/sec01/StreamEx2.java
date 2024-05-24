package sec01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		ArrayList<Integer> arrList1 = new ArrayList<>();
		arrList1.add(5);
		arrList1.add(7);
		arrList1.add(8);
		
		for(int str : arrList1) {
			System.out.println(str);
		}
		
		System.out.println("=================");
		
		Stream<Integer> arrListStream2 = arrList1.stream();
		
		arrListStream2.forEach((x) -> { System.out.println(x);});
	}

}
