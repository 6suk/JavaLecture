package ch17_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex07_mapExam {

	public static void main(String[] args) {
		List<Ex07_Student> list = new ArrayList<>();
		list.add(new Ex07_Student("홍길동", 85));
		list.add(new Ex07_Student("홍길동", 92));
		list.add(new Ex07_Student("홍길동", 87));
		
		list.stream()
		.mapToInt(s -> s.getScore())
		.forEach(x -> System.out.println(x));
		
		List<String> list2 = new ArrayList<>(Arrays.asList("Apple","Banana","Melon","Grape","Strawberry"));
		System.out.println(list2);
		
		list2.stream()
		.map(s -> s.toUpperCase())
		.forEach(s -> System.out.println(s));
	}

}
