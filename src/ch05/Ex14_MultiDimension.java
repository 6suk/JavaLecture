package ch05;

import java.util.Arrays;

/**
 * 다차원 배열
 */

public class Ex14_MultiDimension {

	public static void main(String[] args) {
		int[][] matrix = new int[2][3]; // 2행 3열
		int[][] score = { { 80, 90, 84 }, { 78, 85, 95} };

		System.out.println(score[0][0]);
		System.out.println(score[1][1]);
		System.out.println(score.length); // 행의 갯수
		System.out.println(score[0].length); // 열의 갯수

		// score 값 출력
		for (int i = 0; i < score.length; i++) {
			for (int k = 0; k < score[0].length; k++) {
				System.out.print(score[i][k] + " ");
			}
			System.out.println();
		}
		System.out.println(Arrays.deepToString(score)); // 2차원에서는 불가능
	}

}
