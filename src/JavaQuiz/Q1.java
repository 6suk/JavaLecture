package javaQuiz;

import java.util.Random;

public class Q1 {

	public static void main(String[] args) {

		Random ran = new Random();
		int a = ran.nextInt(6) + 1;
		int b = ran.nextInt(6) + 1;
		int c = ran.nextInt(6) + 1;
		
		System.out.printf("주사위 눈 : %d, %d, %d%n",a,b,c);
		System.out.printf("상금 : %d",money(a, b, c));
		

	}

	public static int money(int a, int b, int c) {

		if (a == b && b == c) {
			return 10000 + a * 1000;
		}

		if (a == b || b == c || a == c) {
			if (b == c) {
				return 1000 + b * 100;
			}
			return 1000 + a * 100;
		}

		else {
			int max = a;
			if (b > max)
				max = b;
			if (c > max)
				max = c;
			return max * 100;
		}

	}
}