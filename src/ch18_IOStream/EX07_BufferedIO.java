package ch18_IOStream;

import java.io.*;

public class EX07_BufferedIO {
	public static void main(String[] args) throws IOException {
		// Case 1) 입출력 스트림으로 생성
		FileInputStream fis = new FileInputStream("c:/temp/forest1.jpg");
		FileOutputStream fos = new FileOutputStream("c:/temp/target1.jpg");
		
		// Case 2) 입출력 스트림 + 버퍼 스트림 생성
		FileInputStream fis2 = new FileInputStream("c:/temp/forest2.jpg");
		FileOutputStream fos2 = new FileOutputStream("c:/temp/target2.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		BufferedOutputStream bos = new BufferedOutputStream(fos2);
		
		// 버퍼를 사용하지 않고 복사
		long nonBufferTime = copy(fis, fos);
		System.out.println("버퍼 미사용 :\t" + nonBufferTime + " ns");
		
		// 버퍼를 사용하지 않고 복사
		long BufferTime = copy(bis, bos);
		System.out.println("버퍼 사용 :\t" + BufferTime + " ns");
		
	}
	
	public static long copy(InputStream is, OutputStream os) throws IOException {
		long startTime = System.nanoTime();
		
		while(true) {
			int data = is.read();
			if(data == -1) break;
			os.write(data);
		}
		os.flush();
		long endTime = System.nanoTime();
		
		return endTime-startTime;
	}
}
