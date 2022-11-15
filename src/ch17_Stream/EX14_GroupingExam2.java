package ch17_Stream;

import java.util.*;
import java.util.stream.Collectors;

public class EX14_GroupingExam2 {

	public static void main(String[] args) {
		List<Ex14_Student> list = new ArrayList<>();
		list.add(new Ex14_Student("홍길동", "남", 92));
		list.add(new Ex14_Student("김수영", "여", 87));
		list.add(new Ex14_Student("감자바", "남", 95));
		list.add(new Ex14_Student("오해영", "여", 93));

		Map<String,List<Ex14_Student>> map = list.stream()
				.collect(
						Collectors.groupingBy(s -> s.getSex())
						);
		List<Ex14_Student> maleList = map.get("남");
		maleList.forEach(x -> System.out.println(x.getName()));
		System.out.println();
		List<Ex14_Student> femaleList = map.get("여");
		femaleList.forEach(x -> System.out.println(x.getName()));
		
	}
}
