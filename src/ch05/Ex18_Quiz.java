package ch05;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex18_Quiz {

	public static void main(String[] args) {
		// length가 30인 정수형 배열 score
		// 100보다 작은 임의의 정수값 입력
		// 가장 큰 수 찾기.

		int[] score = new int[30];
		Random ran = new Random();

		
		for(int i = 0; i < score.length; i++) {
			score[i] = ran.nextInt(100);
		}
		
		int max = 0;	//int max = score[0] 첫번째 값으로 줘도 된다.
		for (int i : score) {
			if (i > max)
				max = i;
		}
		
		int min = 100;	//int min = score[0] 첫번째 값으로 줘도 된다.
		for (int i : score) {
			if (i < min)
				min = i;
		}
		
	
		System.out.println(Arrays.toString(score));
		System.out.println(max);
		System.out.println(min);

	}

}
