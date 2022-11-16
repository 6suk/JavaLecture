package ch11.QuizTime;

import java.util.HashSet;

public class StudentMain {
	public static void main(String[] args) {
		HashSet<Student> hashSet = new HashSet<Student>();
		
		hashSet.add(new Student("1"));
		hashSet.add(new Student("1"));
		hashSet.add(new Student("2"));
		hashSet.add(new Student("3"));
		hashSet.add(new Student("2"));
		
		for(Student a : hashSet)
			System.out.println(a.hashCode());
		
		System.out.println("저장된 Student 수 : "+ hashSet.size());
	}

}
