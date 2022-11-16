package ch11.sec18_dateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFomat {

	public static void main(String[] args) {
		String date1 = "2020-11-04";
		String date2 = "2022년 11월 04일";
		
		LocalDate date1fomat = LocalDate.parse(date1);
		System.out.println(date1fomat);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		LocalDate date2fomat = LocalDate.parse(date2, dtf);
		System.out.println(date2fomat.format(dtf));
	}

}
