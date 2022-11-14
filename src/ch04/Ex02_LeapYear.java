package ch04;

public class Ex02_LeapYear {

	public static void main(String[] args) {
		// 4의 배수면 윤년
		// 100의 배수면 평년
		// 400의 배수면 윤년
		// 1996, 2000, 1900, 2022
		
		System.out.println("1996년은 " + leapYear(1996));
		System.out.println("2000년은 " + leapYear(2000));
		System.out.println("1900년은 " + leapYear(1900));
		System.out.println("2022년은 " + leapYear(2022));
		
	}

	private static String leapYear(int Year) {
		String result;
		if(Year % 400 == 0)
			result = "윤년 입니다.";
		else if(Year % 4 == 0 && Year % 100 != 0)
			result = "윤년 입니다.";
		else
			result = "평년 입니다.";
		
		return result;
	}

	private static String leapYear2(int Year) {
		if(Year % 400 == 0)
			return "윤년 입니다.";
		if(Year % 4 == 0 && Year % 100 != 0)
			return "윤년 입니다.";
		return "평년 입니다.";
	}
	
}
