package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class WriteReadEx {

	public static void main(String[] args) {
		try(OutputStream os = new FileOutputStream("C:/Temp/test5.txt");
				InputStream is = new FileInputStream("c:/temp/test5.txt");) {
			byte arr[]  = {65, 66, 67, 68, 69};
			
			os.write(arr);
			while(true) {
				int data = is.read();
				if( data == -1) {
					break;
				}
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}
