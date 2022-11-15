package ch18_IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex02_ReadExam {

	public static void main(String[] args) throws IOException{
		// 한 글자씩 읽기
		InputStream is = new FileInputStream("c:/temp/test1.db");
		while (true) {
			int data = is.read(); // 1바이트씩 읽고 값 할당
			if(data == -1) break;
			System.out.println(data); // 출력
		}
		is.close();
	}

}
