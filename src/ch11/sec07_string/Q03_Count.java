package ch11.sec07_string;

public class Q03_Count {

	public static void main(String[] args) {
		System.out.println(count("123456789123456789", "12"));
	}
	
	static int count(String src, String target) {
		String elim = src.replace("target", "");
		int len = (src.length() - elim.length()) / target.length();
		return len;
	}

}
