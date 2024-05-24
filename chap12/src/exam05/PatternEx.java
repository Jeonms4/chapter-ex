package exam05;

import java.util.regex.Pattern;

public class PatternEx {

	public static void main(String[] args) {
		// 전화번호부 패턴
		// 지역번호거나 핸드폰 번호-3자리이거나4자리-4자리
		String regEx = "(02|010)-\\d{3,4}-\\d{4}";
		System.out.println("010-123-4567");
		
		Pattern.matches(regEx, "010-123-4567");
		System.out.println(Pattern.matches(regEx, "032-333-2222"));
		
		// 이메일 패턴
		
		String regEx2 = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		
		System.out.println(Pattern.matches(regEx, "abc@gmail.com"));
		System.out.println(Pattern.matches(regEx, "abc@aa.co.kr"));
		
		
	}

}
