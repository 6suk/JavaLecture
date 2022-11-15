package ch17_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EX14_CollecExam {

	public static void main(String[] args) {
		List<Ex14_Student> list = new ArrayList<>();
		list.add(new Ex14_Student("홍길동", "남", 92));
		list.add(new Ex14_Student("김수영", "여", 87));
		list.add(new Ex14_Student("감자바", "남", 95));
		list.add(new Ex14_Student("오해영", "여", 93));

		List<Ex14_Student> mealList = list.stream()
				.filter(x -> x.getSex().equals("남"))
				.collect(Collectors.toList());
		mealList.forEach(x -> System.out.println(x.getName()));
		System.out.println();

		Map<String, Integer> map = list.stream()
				.collect(
						Collectors.toMap(
								s -> s.getName(),
								s -> s.getScore()
								)
						);
		System.out.println(map);
	}
}
