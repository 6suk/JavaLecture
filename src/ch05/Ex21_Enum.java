package ch05;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * 열거(Enumeration)타입
 */

public class Ex21_Enum {
	public enum Week {
		MON, TUE, WED, THU, FRI, SAT, SUN
	}

	public static void main(String[] args) {
		Week today = Week.THU;
		System.out.println(today.name());
		System.out.println(today.ordinal());
		System.out.println(today.compareTo(Week.TUE));
		System.out.println(today.compareTo(Week.SAT));
		
		Week day = Week.valueOf("SAT");
		System.out.println(day.ordinal());
		System.out.println(today);
		
		System.out.println(Arrays.toString(Week.values()));
		
		LocalDate now = LocalDate.now();
		System.out.println(now.getDayOfWeek());
		System.out.println(now);
	}

}
