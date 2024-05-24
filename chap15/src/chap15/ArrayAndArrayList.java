package chap15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndArrayList {

	public static void main(String[] args) {
		int[] arr1 = new int[4];
		arr1[0] = 23;
		arr1[1] = 10;
		arr1[2] = 48;
		arr1[3] = 15;
		
		System.out.println(Arrays.toString(arr1	));
		
		int arr[] = {23,10,48};
		
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
//		List<Integer> list = new ArrayList<Integer>();
		List list = new ArrayList<Integer>();
		System.out.println(list);
		boolean result = list.add(23);
		System.out.println(result);
		System.out.println(list);
		list.add(10);
		System.out.println(list);
		list.add(48);
		System.out.println(list);
		list.add(1, 5);
		System.out.println(list);
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
//		list.add("hi");
//		System.out.println(list);
	}

}
