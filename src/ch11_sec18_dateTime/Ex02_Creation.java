package ch11_sec18_dateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.TimeZone;
// import java.time. *

public class Ex02_Creation {

	public static void main(String[] args) throws InterruptedException {
		
		//날짜
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate examDay = LocalDate.of(2022, 11, 17);
		System.out.println(examDay);

		
		//시간
		LocalTime curTime = LocalTime.now();
		System.out.println(curTime);

		LocalTime lunchTime = LocalTime.of(11, 50, 0, 0);
		System.out.println(lunchTime);

		
		//날짜 + 시간
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		LocalDateTime chrismas = LocalDateTime.of(2022, 12,25,0,0);
		System.out.println(chrismas);
		
		// TimeZone
		ZonedDateTime utcDateTime = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utcDateTime);
		
		ZonedDateTime koDateTime = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(koDateTime);
		
		
		// TimeStamp
		Instant is1 = Instant.now();
		Thread.sleep(10);
		Instant is2 = Instant.now();
		System.out.println(is1.until(is2, ChronoUnit.NANOS));
		
		LocalDate result1 = today.plusYears(1);
		System.out.println(result1);
		
		
		
	}

}
