package ch18_IOStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Ex01_WriteExam {

	public static void main(String[] args) throws IOException {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
	}

}
