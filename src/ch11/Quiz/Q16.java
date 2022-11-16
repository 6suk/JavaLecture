package ch11.Quiz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q16 {

	public static void main(String[] args) {
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일 HH시 mm분");
		System.out.println(sdf.format(now));
		
	}

}
