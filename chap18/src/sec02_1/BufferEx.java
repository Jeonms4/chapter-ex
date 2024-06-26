package sec02_1;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferEx {

	static void copy(InputStream is, OutputStream os) throws Exception {
		long start = System.nanoTime();

		int data = is.read();
		while (true) {
			if (data == -1) {
				break;
			}
			os.write(data);
		}
		
		os.flush();
		
		long end = System.nanoTime();
		System.out.println("걸린 시간 : " + (end - start));
	}

	public static void main(String[] args) {
		String originalFilePath1="C:/ex/data/cat1.jpg";
		String originalFilePath2="C:/ex/data/cat2.jpg";
		String targetFilePath1="C:/temp/targetFile1.jpg";
		String targetFilePath2="C:/temp/targetFile2.jpg";
		// 파일 읽기 쓰기
		
		try(InputStream fis = new FileInputStream(originalFilePath1);
				OutputStream fos = new FileOutputStream(targetFilePath2);
				InputStream bis = new BufferedInputStream(fis);
				OutputStream bos = new BufferedOutputStream(fos);) {
			copy(fis, fos); // 버퍼를 사용하지 않고 복사
			//copy(bis, bos); // 버퍼를 사용해서 복사
		} catch (Exception e) {
			System.out.println("파일 예외 문제");
		}

	}

}
