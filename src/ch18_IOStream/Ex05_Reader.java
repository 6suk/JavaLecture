package ch18_IOStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex05_Reader {

	public static void main(String[] args) throws IOException {
		Reader reader = null;
		
		//1문자씩 읽기
		reader = new FileReader("c:/temp/test.txt");
		while(true) {
			int data = reader.read();
			if(data == -1)
				break;
			System.out.print((char)data);
		}
		reader.close();
		System.out.println();
		
		// 문자 배열로 읽기
		reader = new FileReader("c:/temp/test.txt");
		char[] buf = new char[100];
		
		while (true) {
			int num = reader.read(buf);
			System.out.println(num);
			if(num == -1)
				break;
			for(int i = 0; i < num; i++) {
				System.out.print(buf[i]);
			}
			System.out.println();
		}
		reader.close();
	}

}
