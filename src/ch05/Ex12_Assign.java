package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex12_Assign {

	public static void main(String[] args) {
		// 주사위를 10번 던진 결과를 dice 배열에 넣기
		int[] dice = new int[10];
		Random ran = new Random();

		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1; // .nextInt(6) --> 0 ~ 6 1부터 나오기 위해 + 1
		}
		System.out.println(Arrays.toString(dice));

		// 학생 30명의 시험 점수에 51점 ~ 100 임의 값 할당 후 평균 구하기
		int[] score = new int[30];

		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(50) + 51;
			sum += score[i];
		}
		System.out.println((double) sum / score.length);
		System.out.println(Arrays.toString(score));
		// 한 줄에 6명의 성적 출력
		for (int i = 0; i < score.length; i++) {
			System.out.printf("%3d", score[i]);
			if ((i + 1) % 6 == 0)
				System.out.println();
			else
				System.out.print(", ");
		}
	}

}
