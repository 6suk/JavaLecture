package ch11_sec10_regex;

import java.util.Arrays;

public class Ex02_ReplaceAll {

	public static void main(String[] args) {
		String data = "안녕하세요. 저는 Cat고뚱이입니다!!";
		String result = data.replaceAll("[A-Za-z]", "");	// 대문자 소문자 제거
		System.out.println(result);
		
		result = data.replaceAll("[^가-힣 ]", "");	//한글과 공백만 남기고 모두 제거
		System.out.println(result);
		
		data = System.getenv("JAVA_HOME");
		System.out.println(data);
		String[] arr = data.split("\\\\");
		System.out.println(Arrays.toString(arr));
		
		// 수정하는 법
		
	}

}
