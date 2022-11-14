package javaQuiz;

import java.util.Arrays;

/*
 * Bubble Sort + Selection Sort 혼합 방법
 */

public class Q8 {

	public static void main(String[] args) {

		int[] arr = { 4, 8, 5, 9, 3 };

		for (int i = 0; i < arr.length - 1; i++) {
			for (int k = i + 1; k < arr.length; k++) {
				if (arr[i] < arr[k]) {
					int tmp = arr[i];
					arr[i] = arr[k];
					arr[k] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}
