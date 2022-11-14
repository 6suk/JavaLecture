package ch11;

import java.util.Arrays;
import java.util.regex.Pattern;

/*
 * Caesar 암호
 * 
 * 
 */

public class Q01_Caesar {

	public static void main(String[] args) {

		// ① 배열 하나하나의 값을 + 5한다. (메소드1)
		// ②-1. A - Z 가 아닌게 나오면 (메소드2)
		// ②-2.(a - 26 + 5) 식을 대입한다. (메소드1)
		// ③ 새로운 배열에 넣는다. (메소드1)

		char[] charList = { 'A', 'B', 'V', 'Z' };
		carsar(charList, 5);	//실행1
		System.out.println();
		carsar(charList, 3);	//실행2

	}
	/** 메소드 1 : 값을 더하고 새로운 배열에 넣는 메소드 **/
	
	static void carsar(char[] charList, int num) {

		int index = 0;
		char[] newCaesar = new char[charList.length];

		for (char a : charList) {							
			newCaesar[index] = (char) (a + num); 			// ① 배열 하나 하나의 값을 + 5하고 새로운 배열에 넣는다.

			if (!isCaesar(a, num)) 							// ②-1. 메소드 2의 결과가
				newCaesar[index] = (char) (a - 26 + num); 	// ②-2. false 이면, (a - 26 + 5) 식을 대입하고 새로운 배열에 넣는다.

			index++;
		}

		System.out.println(Arrays.toString(charList) + "를 " + num + "글자씩 밀어내면? ");
		System.out.println(Arrays.toString(newCaesar));

	}
	
	/** 메소드 2 : (a + 5)값이 'A - Z'가 나오는지 검사하는 메소드 **/	
	
	static boolean isCaesar(char a, int num) { 				
		String charPlus = String.valueOf((char) (a + num));	
		return Pattern.matches("[A-Z]", charPlus); 			// ②-1.A - Z라면 true, 아니라면 false 리턴
	}
	
}
