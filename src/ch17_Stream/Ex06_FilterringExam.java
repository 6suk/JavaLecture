package ch17_Stream;

import java.util.ArrayList;
import java.util.List;

public class Ex06_FilterringExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("신용권");
		list.add("김자바");
		list.add("신용권");
		list.add("신민철");
		
		/** .distinct() 중복 제거 */
		list.stream()
		.distinct()
		.forEach(name -> System.out.println(name));
		System.out.println();
		
		/** "신"으로 시작하는 문자열 Filter */
		list.stream()
		.filter(n -> n.startsWith("신"))	//startsWith() 주어진 문자열로 시작하면 true
		.forEach(n -> System.out.println(n));
		
		/** 중복 제거 후, "신"으로 시작하는 문자열 Filter */
		list.stream()
		.distinct()
		.filter(n -> n.startsWith("신"))
		.forEach(n -> System.out.println(n));
		
	}

}
