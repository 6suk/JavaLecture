package ch17_Stream;

import java.util.ArrayList;
import java.util.List;

public class Ex13_ReductionExam {

	public static void main(String[] args) {
		List<Ex13_Student> list = new ArrayList<>();
		list.add(new Ex13_Student("홍길동", 92));
		list.add(new Ex13_Student("신용권", 95));
		list.add(new Ex13_Student("김자바", 88));

		int sum = list.stream()
				.mapToInt(Ex13_Student::getScore)
//				.mapToInt(n -> n.getScore())
				.sum();
		System.out.println("방법 1 : " + sum);

		int sum2 = list.stream()
				.map(Ex13_Student::getScore)
				.reduce(0, (a, b) -> a + b);
		System.out.println("방법 2 : " + sum2);

	}

}
