package ch05;

import java.util.Arrays;
import java.util.Random;

public class Ex13_Args {

	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}

		// 커맨드 라인 입력에서 10보다 큰 정수를 입력하고 약수를 출력하기
		int num = Integer.parseInt(args[0]); // 문자열 > 정수로 변환
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				System.out.println(i);
			}
		}

		// 커맨드 라인 입력에서 받은 숫자만큼 정수 배열을 만들고 주사위 값을 채워넣기
		int[] dice = new int[num];
		Random ran = new Random();

		for (int i = 0; i < dice.length; i++) {
			dice[i] = ran.nextInt(6) + 1;
		}
		System.out.println(Arrays.toString(dice));

	}

}
