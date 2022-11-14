package javaQuiz;

import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		
		int input = sc.nextInt();
		sc.close();
		int tmp = input;
		int count = 0;
		
		
		while (true) {
			count++;
			int a = tmp / 10;
			int b = tmp % 10;
			tmp = (b * 10) + ((a + b) % 10);
			if (tmp == input)
				break;
		}
		System.out.println("사이클 길이 : " + count);
	}
	
}