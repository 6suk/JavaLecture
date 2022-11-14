package ch04;

import java.time.LocalDate;
import java.util.Scanner;

public class Ex06_FullAge {

	public static void main(String[] args) {
		// 생년월일을 입력 받아, 오늘 현재 만 나이를 구하세요.

		Scanner sc = new Scanner(System.in);
		System.out.print("생년 > ");
		int bYear = sc.nextInt();
		System.out.print("생월 > ");
		int bMonth = sc.nextInt();
		System.out.print("생일 > ");
		int bDay = sc.nextInt();

		LocalDate birthDay = LocalDate.of(bYear, bMonth, bDay);
		System.out.println("생년월일 : " + birthDay);
		sc.close();

		LocalDate today = LocalDate.now();
		System.out.println("오늘날짜 : " + today);
		int tYear = today.getYear();
		int tMonth = today.getMonthValue();
		int tDay = today.getDayOfMonth();

		int fullAge = 0;
		if (tMonth > bMonth)
			fullAge = tYear - bYear;
		else if (tMonth < bMonth) // 생일이 아직 안지난 경우
			fullAge = tYear - bYear - 1;
		else {
			if (tDay >= bDay)
				fullAge = tYear - bYear;
			else
				fullAge = tYear - bYear - 1;
		} // tMonth 와 dMonth가 같은 경우

		System.out.println("만 나이 : " + fullAge);
	}

}
