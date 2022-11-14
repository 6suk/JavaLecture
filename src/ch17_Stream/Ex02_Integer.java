package ch17_Stream;

import java.util.Arrays;
import java.util.List;

public class Ex02_Integer {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3, 4, 5, 6, 7);
		
		/** 홀수숫자만 뽑아서, 제곱을 한다. */
		list.stream()
		.filter(num -> num % 2 == 1)	// 중간 처리, 여러개 사용 가능
		.map(num -> num * num)
		.sorted()
		.forEach(num -> System.out.println(num)); // 최종 처리, 한개만 사용가능
	}
}
