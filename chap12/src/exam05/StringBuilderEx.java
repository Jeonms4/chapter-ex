package exam05;

import java.util.StringTokenizer;

public class StringBuilderEx {

	public static void main(String[] args) {
		String str1="hi";
		
		System.out.println(str1);
		System.out.println(str1.toString());
		
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		
		str1="nice";
		
		System.out.println(str1.hashCode());
		System.out.println(System.identityHashCode(str1));
		
		StringBuilder strbuilder = new StringBuilder();
		System.out.println(strbuilder);
		System.out.println(System.identityHashCode(strbuilder));
		
//		strbuilder.append("DEF");
//		System.out.println(System.identityHashCode(strbuilder));
//		System.out.println(strbuilder);
//		strbuilder.insert(0, "ABC");
//		System.out.println(strbuilder);
//		strbuilder.delete(3, 4);
//		System.out.println(strbuilder);
		
		strbuilder.append("DEF").insert(0, "ABC").delete(3, 4);
		
		System.out.println(strbuilder);
		String str2="홍길동, 김길동, 박길동";
		
		StringTokenizer stringtokenizer = new StringTokenizer(str2);
		
		System.out.println(stringtokenizer);
		// 공간의 효과적 사용
		
		while(stringtokenizer.hasMoreTokens()) {
			System.out.println(stringtokenizer.nextToken());
		}
	}

}
