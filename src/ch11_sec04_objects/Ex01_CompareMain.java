package ch11_sec04_objects;

import java.util.Objects;

public class Ex01_CompareMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "박자바");
		Student s2 = new Student(2, "박자바");
		Student s3 = new Student(3, "홍자바");
		
		StudentComparator comp = new StudentComparator();
		int s1s2 = Objects.compare(s1, s2, comp);
		System.out.println(s1s2);
		
		
	}

	
}
