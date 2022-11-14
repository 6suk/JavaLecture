package ch04;

import java.util.Scanner;

public class Ex16_Quiz {

	public static void main(String[] args) {
		// 10보다 큰 정수를 입력 받아 1부터 입력받은 숫자까지의 제곱의 합(sumOfSquare)
		// 합의 제곱을 구하세요.(squareOfSum)
		
		
		int num = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("10보다 큰 정수를 입력하세요 > ");
			num = sc.nextInt();
			if(num > 10) {
				break;
			}
		}
		sc.close();
		
		int sumOfSquare = 0;
		int sum = 0;
		
		for(int i = 1; i <= num; i++) {
			sum += i;
			sumOfSquare += i * i;
	
		}
		int SquareOfSum = sum * sum;

		System.out.println("제곱의 합 : " + sumOfSquare);
		System.out.println("합의 제곱 : " + SquareOfSum);
		
		
	}

}
