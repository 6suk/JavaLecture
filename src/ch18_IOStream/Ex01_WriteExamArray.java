package ch18_IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * 바이트 배열 출력
 *
 */
public class Ex01_WriteExamArray {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("C:/temp/test2.db");
		byte[] arr = { 10, 20, 30 };
		os.write(arr);
		os.flush();
		os.close();
		
	}
}
