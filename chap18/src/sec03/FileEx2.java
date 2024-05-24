package sec03;

import java.io.File;

public class FileEx2 {

	public static void main(String[] args) {
		//File dir = new File("e:/test4/twodir/file1");
		File dir = new File("e:/test5");
		System.out.println(dir);
		
		//하위 경로까지 하고자 할 경우에는 mkdirs()
		System.out.println(dir.mkdirs());
		File file = new File("e:/test5/testfile.txt");
		try {
			System.out.println(file.createNewFile());
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
