package javaQuiz;

import java.util.Scanner;

public class Q2_new {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int num = sc.nextInt();
		sc.close();

		System.out.println("사이클 길이 : " + plusCycle(num));
	}
	
	public static int plusCycle(int num) {
		int originalNum = num;
		int cylcle = 0;

		while (true) {
			cylcle++;
			int digit10 = (num < 10) ? 0 : (num / 10);
			int digit1 = num % 10;
			num = digit1 * 10 + (digit10 + digit1) % 10;
//			System.out.println(num);
			if (num == originalNum)
				return cylcle;
		}
	}
}
