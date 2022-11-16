package ch11.Quiz;

import java.util.regex.Pattern;

public class Q17 {

	public static void main(String[] args) {
		//첫번째는 알파벳으로 시작, 두번째부터 숫자와 알파벳으로 구성된 8~12자 사이
		//알바벳은 대소문자 모두 허용
		
		String id1 = "5Angel1004";
		String id2 = "Angeddl1004";
		String regExp = "[a-zA-Z][a-zA-z0-9]{7,11}";
		boolean isMatch = Pattern.matches(regExp, id2);
		
		if(isMatch) {
			System.out.println("사용가능");
		}else {
			System.out.println("불가능");
		}

	}

}
