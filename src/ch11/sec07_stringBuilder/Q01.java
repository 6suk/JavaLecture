package ch11.sec07_stringBuilder;

/*
 * Palindrome
 * 
 * 3자리 정수 두개를 곱해서 나온 값 (100 * 100 = 10000)
 * 이 팔린드롬이라고 할 때
 * 가장 큰 팔림드롬 수는?
 * 
 */

public class Q01 {

	public static void main(String[] args) {

		int max = 0, x = 0, y = 0;
		for (int i = 100; i < 1000; i++) {
			for (int k = i; k < 1000; k++) {
				int mul = i * k;
				if (isPalindrome(mul) && mul > max) {
					max = mul;
					x = i;
					y = k;
				}
			}
		}
		System.out.println(x + " * " + y + " = " + max);
	}

	/** StringBulilder로 만든 isPalindrome Method */

	static boolean isPalindrome(int mul) {
		String mulStr = String.valueOf(mul);
		StringBuilder sb = new StringBuilder(mulStr);
		return mulStr.equals(sb.reverse().toString());
	}
}
