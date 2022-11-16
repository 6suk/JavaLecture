package ch11.sec07_string;

import java.util.Arrays;
import java.util.StringTokenizer;

public class StringTokenizerEx {

	public static void main(String[] args) {
		String data1 = "고예림,고뚱이&고시케 정현철";
		String[] arr = data1.split(",|/|&| ");
		System.out.println(Arrays.toString(arr));
		
		
		System.out.println("==============================");
		String data = "고예림/고뚱이/고시케";
		StringTokenizer st = new StringTokenizer(data, "/");
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			System.out.println(a);
		}
		
	}

}
