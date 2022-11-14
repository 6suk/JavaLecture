package ch11_Quiz;

import java.util.StringTokenizer;

public class Q11 {

	public static void main(String[] args) {
		String data = "아이디,이름,패스워드";
		StringTokenizer st = new StringTokenizer(data,",");
		
		while(st.hasMoreTokens()) {
			String a = st.nextToken();
			System.out.println(a);
		}
	}

}
