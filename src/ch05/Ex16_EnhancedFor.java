package ch05;

/**
 * 향상된 For문
 */

public class Ex16_EnhancedFor {

	public static void main(String[] args) {
		String[] fruits = { "A", "B", "C" };

		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}

		for (String fruit : fruits) {
			System.out.println(fruit);
		} // 권장하는 방식

		int[] score = { 82, 78, 90, 84, 76 };

		int sum = 0;
		for (int arg : score)
			sum += arg;

		System.out.println((double) sum / score.length);
	}

}


