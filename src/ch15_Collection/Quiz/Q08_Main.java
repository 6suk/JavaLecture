package ch15_Collection.Quiz;

import java.util.HashSet;
import java.util.Set;

public class Q08_Main {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<>();

		set.add(new Student(1, "홍길동"));
		set.add(new Student(2, "신용권"));
		set.add(new Student(1, "조민우"));

		System.out.println("저장된 객체 수 : " + set.size());
		set.forEach(x -> System.out.println(x.stuNum + ":" + x.name));
	}
}
