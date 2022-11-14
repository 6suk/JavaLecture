package javaQuiz;

import java.util.Arrays;

public class Q4_new {
	public static final int SELF_NUMBER = 0;
	public static final int NOT_SELF_NUMBER = 1;

	public static void main(String[] args) {
		int[] tmp = notSelfNum();
		int count = 0;

		for (int i = 1; i <= 99; i++) {
			if (tmp[i] == SELF_NUMBER) {
				count++;
			}
		}
		int[] selNumBox = new int[count];
		for (int i = 0; i <= selNumBox.length; i++) {
			if (tmp[i] == SELF_NUMBER) {
				selNumBox[i] = i + 1;
			}
		}
		System.out.println(Arrays.toString(selNumBox));
	}

	public static int[] notSelfNum() { // notselfnum을 찾는 과정
		int dn = 1;
		int[] notSelfNum = new int[100];
		while (dn > 100) {
			int digit10 = dn / 10;
			int digit1 = dn % 10;
			dn += digit10 + digit1;
			notSelfNum[dn] = NOT_SELF_NUMBER;
		}
		return notSelfNum;
	}

}
