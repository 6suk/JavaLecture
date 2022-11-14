package ch11_sec18_dateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ex04_Operation {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// 직접 조작
		LocalDateTime target = now
				.plusYears(3)
				.minusMonths(8)
				.minusDays(3);
		System.out.println(target);
		
		target = now.with(now);
		
		LocalTime now2 = LocalTime.now();
		System.out.println(now2);
		LocalTime target2 = LocalTime.of(22,8,30);
		System.out.println(target2);
		
	}

}
