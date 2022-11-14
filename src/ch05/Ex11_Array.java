package ch05;

import java.util.Arrays;

public class Ex11_Array {

	public static void main(String[] args) {
		int score1 = 80, score2 = 70, score3 = 95, score4 = 68, score5 = 85;
		int sum = score1 + score2 + score3 + score4 + score5;
		double avg = sum / 5.;
		System.out.println(avg);

		int[] score = { 80, 70, 95, 68, 85 };
		System.out.println(score[0]);
		System.out.println(score[4]);

		sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println((double) sum / score.length);

		int[] intArray = new int[] { 1, 2, 3, 4, 5 }; // 기본
		double[] dArray = { 5.2, 2.3, 5.7, 9.2, 4.5 }; // 초기화 값을 {}로 제공
		String[] strArray = new String[5]; // 갯수만 정해서 배열을 생성

		int a;
		int[] b = new int[3];
//		System.out.println(a);		//초기화하지 않은 변수 a를 참조하므로 에러
		System.out.println(b[0]); // 배열은 기본값으로 초기화됨

		String s = "홍길동";
		System.out.println(s.length()); // 스트링의 길이는 .length()
		System.out.println(score.length); // 배열 길이는 .length

		System.out.println(score);
		System.out.println(Arrays.toString(intArray)); // Arrays.toString()
	}

}
