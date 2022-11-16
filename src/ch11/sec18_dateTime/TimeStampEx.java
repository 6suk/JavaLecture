package ch11.sec18_dateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeStampEx {

	public static void main(String[] args) {
		
		LocalDateTime startDateTime = LocalDateTime.now();
		LocalDateTime endDateTime = LocalDateTime.of(2022,11,17,11,00,00);
		
		// 시간 사이의 간격
		Duration duration = Duration.between(startDateTime, endDateTime);
		System.out.println(duration.getSeconds());
		
		LocalDate startDate = LocalDate.now();
		LocalDate endDate = LocalDate.of(2022, 11, 17);
		
		// 날짜 사이의 간격
		Period period = Period.between(startDate, endDate);
		System.out.println("Y : " + period.getYears()+", M : " 
		+ period.getMonths()+", D : " +period.getDays());
		
		long y = ChronoUnit.YEARS.between(startDateTime, endDateTime);
		long m = ChronoUnit.MONTHS.between(startDateTime, endDateTime);
		long w = ChronoUnit.WEEKS.between(startDateTime, endDateTime);
		long d = ChronoUnit.DAYS.between(startDateTime, endDateTime);
		long hour = ChronoUnit.HOURS.between(startDateTime, endDateTime);
		long min = ChronoUnit.MINUTES.between(startDateTime, endDateTime);
		long sec = ChronoUnit.SECONDS.between(startDateTime, endDateTime);
		
		System.out.printf("%d년%d월%d일 남았습니다.%n",y,m,d,hour,min,sec);
		System.out.printf("%d시간%d분%d초 남았습니다.%n",hour,min,sec);
		System.out.printf("%d",w);
		
		
		
	}

}
