package javaQuiz;

import java.util.Arrays;

public class Q4 {

	public static void main(String[] args) {

		int[] box = new int[100];
		int sum = 0;
		int index = 0;

		for (int i = 1; i <= 100; i++) {
			if (i < 10) {
				sum = i + i;
				box[index] = sum;
				index++;
			} else {
				int a = (i / 10);
				int b = (i % 10);
				sum = i + a + b;
				box[index] = sum;
				index++;
			}
		}
		System.out.println(Arrays.toString(box));

		int count = 0;
		for (int i = 1; i <= 101; i++) {
			int a = Arrays.binarySearch(box, i);
			if (a < 0) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);

	}

}
