package ch04;

import java.util.Scanner;

public class Ex15_Divisor {

	public static void main(String[] args) {
		// 10보다 큰 정수를 입력 받아 약수를 찾아주는 프로그램을 작성하세요.
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			System.out.print("10보다 큰 정수 입력 > ");
			num = sc.nextInt();
			if (num > 10)
				break;
		}
		sc.close();

		String result = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				result = result + " " + i;
//			else
//				continue; 
		}
		System.out.println(num + "의 약수는 " + result);
	}

}
