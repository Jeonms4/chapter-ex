package sec02_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test3.db");
			byte arr[]  = {10, 20, 30, 40, 50};
			
			os.write(arr);
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}
