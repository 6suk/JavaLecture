package ch18_IOStream.File;

import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExam {
	public static void main(String[] args) throws Exception{
		/** File 객체 생성 */
		File dir = new File("c:/temp/images");
		File f1 = new File("c:/temp/file1.txt");
		File f2 = new File("c:/temp/file2.txt");
		File f3 = new File("c:/temp/file3.txt");
		
		/** 존재하지 않으면 디렉토리 또는 파일 생성 */
		if(dir.exists() == false) {dir.mkdir();}
		if(f1.exists() == false) {f1.createNewFile();}
		if(f2.exists() == false) {f2.createNewFile();}
		if(f3.exists() == false) {f3.createNewFile();}
		
		/** Temp 폴더의 내용을 출력 */
		File temp = new File("c:/temp");
		File[] files = temp.listFiles();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd a HH:mm");
		
		for(File file : files) {
			System.out.printf("%-25s",sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) System.out.printf("%-10s%-20s","<DIR>",file.getName());
			else System.out.printf("%-10s%-20s",file.length(), file.getName());
			System.out.println();
			
		}
		
		/** 입출력 스트림을 생성할 때 File 객체 활용하기(경로 제공 목적) */
		// 1. 첫 번째 방법
		FileInputStream fis = new FileInputStream("c:/temp/image.txt");
		
		// 2. 두 번째 방법
		File filePaths = new File("c:/temp/image.txt");
		FileInputStream fis2 = new FileInputStream(filePaths);
		
	}
}
