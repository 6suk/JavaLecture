package ch18_IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03_CopyExam {

	public static void main(String[] args) throws IOException{
		InputStream is = new FileInputStream("c:/temp/forest1.jpg");
		OutputStream os = new FileOutputStream("c:/temp/forest_copy.jpg");
		
//		byte[] arr = new byte[1024];
//		while (true) {
//			int num = is.read(arr);
//			if(num == -1) break;
//			for(int i = 0; i < num; i++)
//				os.write(arr[i]);
//		}
		is.transferTo(os); // 위 한줄로 대체 가능
		
		os.flush();
		os.close();
		is.close();
		
	}

}
