package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

public class ReadEx {

	public static void main(String[] args) {
		try(InputStream is = new FileInputStream("c:/temp/test3.db");) {
		
		while(true) {
			int data=is.read();
			if(data == -1) {
				break;
			}
			System.out.println(data);
		}
		
		is.close();
		} catch(Exception e) {
			System.out.println("파일 관련 예외");
		}
		
	}

}
