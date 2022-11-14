package ch04;

import java.util.Scanner;

public class Ex11_for {

	public static void main(String[] args) {
		// 1에서 100까지 합
		int sum = 0;
		for (int i = 1; i <= 1000; i++) {
			sum += i;
		}
		System.out.println(sum);

		// 1에서 10까지 곱
		int num = 1; // 곱일땐 초기값을 1로 주기.
		for (int i = 1; i <= 10; i++) {
			num *= i;
		}
		System.out.println(num);

		// 사용자가 입력한 문자열을 5회 받아서 하나의 문자열로 만들기
		Scanner sc1 = new Scanner(System.in);

		String result = "";
		for (int i = 0; i < 5; i++) {
			System.out.print("입력 >>> ");
			String s = sc1.nextLine();

			result += s + " ";
		}

		System.out.println(result);
		sc1.close();

	}

}
