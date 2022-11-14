package ch17_Stream;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Ex12_OptionalExam {

	public static void main(String[] args) {
		int[] arr2 = { 1, 2, 3, 4 };
		/** Optional */
		// 5의 배수 평균
		try {
			double avg2 = Arrays.stream(arr2)
					.filter(n -> n % 5 == 0)
					.average().getAsDouble();
			System.out.println("5의 배수 평균 : " + avg2);
			// 집계 값이 없을 때 NoSuchElementException 오류
		} catch (Exception e) {}

		/** 해결 방법1 */
		OptionalDouble avg3 = Arrays.stream(arr2).filter(n -> n % 5 == 0).average();
		if (avg3.isPresent())
			System.out.println("방법 1. 5의 배수 평균 : " + avg3.getAsDouble());
		else {
			System.out.println("방법 1. 5의 배수가 없습니다");
		}
		
		/** 해결 방법2 */
		double avg4 = Arrays.stream(arr2)
		.filter(n -> n % 5 == 0)
		.average()
		.orElse(0.0);
		System.out.println("방법 2. 5의 배수 평균 : " + avg4);
		
		/** 해결 방법3 - 권장 */
		Arrays.stream(arr2)
		.filter(n -> n % 5 == 0)
		.average()
		.ifPresent(n -> System.out.println("방법 3. 5의 배수 평균 : " + n));
		
	}

}
