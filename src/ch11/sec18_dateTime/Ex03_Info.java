package ch11.sec18_dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ex03_Info {

	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		int year = now.getYear();
		int month = now.getMonthValue();
		int day = now.getDayOfMonth();
		DayOfWeek weekDay = now.getDayOfWeek();
		System.out.println(weekDay);
		
		int hour = now.getHour();
		int minute = now.getMinute();
		int second = now.getSecond();
		int nano = now. getNano();
		
		LocalDate nowDate = now.toLocalDate();
		DateTimeFormatter arf = DateTimeFormatter.ofPattern("yyyy.MM.dd");
		System.out.println(now.format(arf));
		
		
		
		
	}

}
