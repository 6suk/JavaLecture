package ch11.sec10_regex;

import java.util.regex.Pattern;

public class Ex01_Pattern {

	public static void main(String[] args) {
		String regExp = "(010|02)-\\d{3,4}-\\d{4}";	//전화번호 정규식
		
		
		String arr = "010-2645-6789";
		boolean result = Pattern.matches(regExp, arr);
		System.out.println(result);
		
		
		arr = "02-2624-6789";
		result = Pattern.matches(regExp, arr);
		System.out.println(result);
		
		
		arr = "02-26524-6789";
		result = Pattern.matches(regExp, arr);
		System.out.println(result);
		
		
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		arr = "koandjo@naver.com";
		result = Pattern.matches(regExp, arr);
		System.out.println(result);
		
		arr = "koand.jo@naver.com";
		result = Pattern.matches(regExp, arr);
		System.out.println(result);
		
		
	}

}
