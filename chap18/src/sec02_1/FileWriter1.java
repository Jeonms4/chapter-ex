package sec02_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class FileWriter1 {

	public static void main(String[] args) {
		try (Writer os = new FileWriter("c:/temp/test6.txt"); 
				Reader is = new FileReader("c:/temp/test6.txt");) {
			byte arr[] = { 65, 66, 67, 68, 69 };

			// os.write(arr);
			while (true) {
				int data = is.read();
				if (data == -1) {
					break;
				}
				System.out.println(data);
			}
		} catch (Exception e) {
			System.out.println("파일 관련 예외");
		}

	}

}
