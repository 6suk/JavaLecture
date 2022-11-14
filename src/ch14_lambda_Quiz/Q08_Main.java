package ch14_lambda_Quiz;

import ch14_lambda_Quiz.Q08_Student.Function;

public class Q08_Main {

	// 데이터
	private static Q08_Student[] students = {
			new Q08_Student("고뚱이", 90, 96),
			new Q08_Student("김식혜", 95, 93) };

	public static double avg(Function<Q08_Student> stu) {
		int sum = 0;
		for (Q08_Student a : students) {
			sum += stu.apply(a);
		}
		return ((double) sum) / students.length;
	}

	public static void main(String[] args) {
		double engAvg = avg(s -> s.getEngScore());
		System.out.println("영어 평균 점수 : " + engAvg);

		double mathAvg = avg(s -> s.getMathScore());
		System.out.println("수학 평균 점수 : " + mathAvg);
	}
}

