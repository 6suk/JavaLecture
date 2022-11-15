package ch18_IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class Ex06_CharacterConvertStream {

	public static void main(String[] args) throws IOException {
		streamWriter("안녕하세요!");
		String result = streamReader();
		System.out.println(result);
	}

	private static String streamReader() throws IOException {
		InputStream is = new FileInputStream("c:/temp/test.txt");
		Reader reader = new InputStreamReader(is, "UTF8");
		char[] buf = new char[100];
		int num = reader.read(buf);
		reader.close();
		String str = new String(buf, 0, num);
		return str;
	}

	private static void streamWriter(String string) throws IOException {
		OutputStream os = new FileOutputStream("c:/temp/test.txt");
		Writer writer = new OutputStreamWriter(os,"UTF-8");
		writer.write(string);
		writer.flush();
		writer.close();
	}
	

}
