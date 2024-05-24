package sec02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteReadEx1 {

	public static void main(String[] args) {
		//스트림 (입,출) 파일의 형태(문자포함, 문자만)
		try {
			OutputStream os = new FileOutputStream("C:/ex/data/test7.txt");
			
			os.write(65);
			os.write(66);
		} catch(Exception e) {
			
		}

	}

}
