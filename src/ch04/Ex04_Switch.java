package ch04;

public class Ex04_Switch {

	public static void main(String[] args) {
		int score = 53;
		String grade;

		switch (score / 10) { // switch문의 조건식 결과는 정수, 문자열만 가능
		case 10:
		case 9: // case문의 값은 정수, 상수(문자 포함), 문자열만 가능하다.
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break; // switch 블록 탈출
		default: // 위에서 조건이 맞지 않는 경우
			grade = "F";
		}
		System.out.println(grade);
	}
}
