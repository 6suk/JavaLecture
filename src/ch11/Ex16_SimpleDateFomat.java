package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex16_SimpleDateFomat {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초");
		System.out.println(sdf.format(now));
		
		
	}

}
