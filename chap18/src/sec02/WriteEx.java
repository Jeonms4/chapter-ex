package sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteEx {

	public static void main(String[] args) {
		try {
			OutputStream fos2 = new FileOutputStream("C:/ex/data/test7.txt");
			byte a = 69;
			byte b = 70;

			byte arrByte[] = { 71, 72, 73, 74 };
			fos2.write(a);
			fos2.write(b);
			fos2.write(arrByte);
			fos2.close();
		} catch (Exception e) {
			System.out.println("파일 관련(폴더나 파일명, 입출력 관련) 에러");
		}

	}

}
