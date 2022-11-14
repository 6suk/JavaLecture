package ch11;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Caesar {

	static void carsar(char[] charList, int num) {

		int index = 0;
		char[] newCaesar = new char[charList.length];

		for (char a : charList) {							// 메소드 1.
			newCaesar[index] = (char) (a + num); 			// ① 배열 하나하나의 값을 + 5한다.

			if (!isCaesar(a, num)) 							// ②-1. 메소드 2의 결과가
				newCaesar[index] = (char) (a - 26 + num); 	// ②-2. false 이면, (a - 26 + 5) 식을 대입한다.

			index++;
		}

		System.out.println(Arrays.toString(charList) + "를 " + num + "글자씩 밀어내면? ");
		System.out.println(Arrays.toString(newCaesar));

	}
															
	static boolean isCaesar(char a, int num) { 				// 메소드 2.
		String charPlus = String.valueOf((char) (a + num));	// ②-1. (a + 5)값이 A - Z 가 나오는지 검사하는 메소드
		return Pattern.matches("[A-Z]", charPlus); 			// A - Z라면 true, 아니라면 false 리턴
	}
}