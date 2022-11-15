package ch18_IOStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Ex02_ReadExamArray {
public static void main(String[] args) throws IOException{
	// 바이트 배열로 읽기 read(byte[])
	InputStream is = new FileInputStream("c:/temp/test2.db");
	
	byte[] data = new byte[100];
	while (true) {
		int num = is.read(data); //읽은 바이트는 data2에 저장
		if(num == -1) break;
		for(int i = 0; i < num; i++)
			System.out.println(data[i]);
	}
	is.close();
}
}
