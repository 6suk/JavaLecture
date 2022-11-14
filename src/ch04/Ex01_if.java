package ch04;

public class Ex01_if {

	public static void main(String[] args) {
		// 단일 if
		int number = 35;
		if(number % 5 == 0) {
			System.out.println(number + "는 5의 배수입니다.");
		}
		if(number %7 == 0)	// 실행문이 1개일 경우, 중괄호 생략 가능
			System.out.println(number + "는 7의 배수입니다.");		
		
		// if-else문		
		if(number % 2 == 0) {
			System.out.println(number + "은/는 짝수입니다.");
		}else {
			System.out.println(number + "은/는 홀수입니다.");
		}
		
		String evenOdd;
		if(number % 2 == 0) 
			evenOdd = "은/는 짝수입니다.";
		else
			evenOdd = "은/는 홀수입니다.";
		System.out.println(number + evenOdd);
		
		
		String evenOdd1 = "은/는 짝수입니다.";
		if(number % 2 == 1)
			evenOdd1 = "은/는 홀수입니다.";
		System.out.println(number + evenOdd1);
		
		//삼항연산자
		String evenOdd3 = (number % 2 == 0) ? "은/는 짝수입니다." : "은/는 홀수입니다.";
		System.out.println(number + evenOdd3);
		
		// if - else if - else
		int score = 82;
		String grade;
		if (score >= 90 && score <= 100)
			grade = "A";
		else if (score >= 80)
			grade = "B";
		else if (score >= 70)
			grade = "C";
		else if (score >= 60)
			grade = "D";
		else
			grade = "F";
		System.out.println(score+"점은 "+grade + "학점 입니다.");
		// 순서를 유의할 것 가장 작은 조건부터 시작해야한다!
		
		//Ex02_LeapYear
		
		
		
		
	}

}
