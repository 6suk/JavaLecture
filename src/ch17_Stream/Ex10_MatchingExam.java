package ch17_Stream;

import java.util.Arrays;

public class Ex10_MatchingExam {

	public static void main(String[] args) {
		int[] intArr = { 2, 4, 6 };
		
		boolean result = Arrays.stream(intArr)
				.allMatch(a -> a%2 ==0);
		System.out.println("모두 2의 배수인가? " + result);
		
	}

}
