package sec02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;

public class Test {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/ex/data/test8.txt");

			os.write(65);
			os.write(66);

			byte arr[] = { 67, 68, 69 };
			os.write(arr);

			InputStream is = new FileInputStream("C:/ex/data/test8.txt");
			FileReader reader = new FileReader("C:/ex/data/test10.txt");

			while (true) {
				int result = is.read();
				int result2 = is.read(arr);
				
				if(result ==1) {
					break;
				}
				System.out.println(result2);

				os.close();
			}
		} catch (Exception e) {
			System.out.println();
		}

	}

}
