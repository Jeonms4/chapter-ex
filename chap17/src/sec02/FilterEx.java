package sec02;

import java.util.ArrayList;
import java.util.List;

public class FilterEx {
	public static void main(String args[]) {
		List<String> arrList = new ArrayList<String>();
		arrList.add("홍일동");
		arrList.add("홍이동");
		arrList.add("홍삼동");
		
		arrList.stream().distinct().forEach((x)->{System.out.println(x);});
		
		arrList.stream().filter(null);
	}
}
