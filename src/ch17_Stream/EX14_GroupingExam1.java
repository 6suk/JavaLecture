package ch17_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EX14_GroupingExam1 {

	public static void main(String[] args) {
		List<Ex14_Student> list = new ArrayList<>();
		list.add(new Ex14_Student("홍길동", "남", 92));
		list.add(new Ex14_Student("김수영", "여", 87));
		list.add(new Ex14_Student("감자바", "남", 95));
		list.add(new Ex14_Student("오해영", "여", 93));

		Map<String, Double> map = list.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex(),
								Collectors.averagingDouble(s -> s.getScore())));

		System.out.println(map);
	}
}
