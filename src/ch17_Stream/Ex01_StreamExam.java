package ch17_Stream;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Ex01_StreamExam {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("신용권");
		set.add("김자바");
		
		Stream<String> stream = set.stream();
		stream.forEach(name -> System.out.println(name));
		
		set.stream()
		.forEach(s -> System.out.println(s));
		
	}

}
