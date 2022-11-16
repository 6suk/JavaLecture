package ch17_Stream.Quiz;

import java.util.ArrayList;
import java.util.List;

public class Q5 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("This is a java book");
		list.add("Lambda Expressions");
		list.add("Java8 supports lambda expressions");
		
		/** 답 작성 코드 */
		list.stream()
		.filter(x -> x.toLowerCase().contains("java"))
//		.filter(x -> x.toLowerCase().indexOf("java") >= 0)
		.forEach(x -> System.out.println(x));
	}

}
