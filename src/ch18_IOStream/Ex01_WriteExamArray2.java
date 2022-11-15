package ch18_IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_WriteExamArray2 {
	public static void main(String[] args) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/test3.db");
		byte[] arr = { 10, 20, 30, 40, 50 };
		
		os.write(arr, 1, 3);	// 1번 인덱스부터 3개까지만 출력
		
		os.flush();
		os.close();
	}
}
