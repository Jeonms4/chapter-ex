package exam05;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
//import java.sql.Date;

public class DateAndTimeEx {

	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.toString());
		System.out.println(date.toGMTString());
		System.out.println(date.getYear());
		System.out.println(2024-1900);
		
		// 간단한 날짜 형식으로 나타내주는 클래스와 함께 사용
		
		System.out.println("============");
		
		Date sqlDate = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		
		String nowDate = simpleDateFormat.format(date);
		System.out.println(nowDate);
		
		System.out.println("===========");
		
		System.out.println(LocalDateTime.now());
		String nowDate2 = simpleDateFormat.format(LocalDateTime.now());
		System.out.println(nowDate2);
	}

}
