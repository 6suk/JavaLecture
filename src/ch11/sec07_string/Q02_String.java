package ch11.sec07_string;

public class Q02_String {

	public static void main(String[] args) {
		String str = "Hello";
		String str2 = "안녕하세요";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
		System.out.println(reverse(str2));
		
		String str3 = "우영우";
		System.out.println(isPalindrome(str3));
		
		
		
		
	}
	
	static boolean isPalindrome(String str) {
		return str.equals(reverse(str));
	}
	
	
	static String reverse(String str) {
		String result = "";
		int len = str.length();
		
		
		for (int i = 1; i <= len; i++) {
			result += str.charAt(len - i);
		}
		return result;
		
	}
	

}
