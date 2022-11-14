package ch04;

import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Random ran = new Random(); // 객체 생성
		int num = ran.nextInt(100) + 1; // 1 ~ 100까지의 임의의 정수값 생성
		String result;

		System.out.print("입력하세요>>> ");
		Scanner sc = new Scanner(System.in); // 객체 생성
		int num2 = sc.nextInt();
		num = num2;

		if (num % 3 == 0 && num % 5 == 0) // num % 15 == 0과 동일
			result = " = FizzBuzz";
		else if (num % 3 == 0)
			result = " = Fizz";
		else if (num % 5 == 0)
			result = " = Buzz";
		else
			result = " = " + num;
		System.out.println(num + result);
	}

}