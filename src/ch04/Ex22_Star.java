package ch04;

import java.util.Scanner;

// 별 모양으로 삼각형 그리기

public class Ex22_Star {

	public static void main(String[] args) {

		int num = 0;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.print("8보다 작은 정수 입력 >> ");
			num = sc.nextInt();
			if (num <= 8)
				break;
		}

		// 1사분면
		for (int i = 1; i <= num; i++) { // i : 1 ~ 5
			for (int k = 1; k <= i; k++) { // k : i번 만큼
				System.out.print("*");
			}
			System.out.println();
		}
		// 4사분면
		for (int i = num; i >= 1; i--) { // i : 5 ~ 1
			for (int k = 1; k <= i; k++) { // k : i번 만큼
				System.out.print("*");
			}
			System.out.println();
		}

		// 2사분면
		// space : num - i
		// * : i
		for (int i = 1; i <= num; i++) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 3사분면
		// space : num - i
		// * : i
		for (int i = num; i >= 1; i--) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
