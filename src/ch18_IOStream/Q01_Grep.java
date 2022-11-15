package ch18_IOStream;

import java.io.BufferedReader;
import java.io.FileReader;

public class Q01_Grep {
	
	public static void main(String[] args) throws Exception {
		grep("line", "c:/temp/Q01_Grep.java");
	}
	
	public static void grep(String word, String filePath) throws Exception{
		BufferedReader br = new BufferedReader(new FileReader(filePath));
		int lineNo = 0;
		
		while (true) {
			String rowData = br.readLine();
			if(rowData == null) break;
			lineNo++;
			String lineData = rowData.toLowerCase();
			if(lineData.indexOf(word) >= 0)
				System.out.println(lineNo + " : " + rowData);
		}
		br.close();
	}
}
