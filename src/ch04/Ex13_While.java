package ch04;

import java.util.Scanner;

public class Ex13_While {

	public static void main(String[] args) {
		// 정수 입력, 합이 100보다 작을 때 까지 입력
		Scanner sc = new Scanner(System.in);

		int sum = 0;

		while (sum < 100) {
			System.out.print("정수 입력 >  ");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println(sum);

		sum = 0;
		while (true) { // 조건을 만족시키면 탈출
			System.out.print("정수 입력 >  ");
			int num = sc.nextInt();
			sum += num;
			if (sum >= 100) {
				break;
			}
			System.out.println(sum);
			sc.close();
		}

	}

}
