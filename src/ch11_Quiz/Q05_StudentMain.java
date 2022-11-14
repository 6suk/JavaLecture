package ch11_Quiz;

import java.util.HashSet;

public class Q05_StudentMain {

	public static void main(String[] args) {
		
		Q05_Student s1 = new Q05_Student("1");
		Q05_Student s2 = new Q05_Student("1");
		Q05_Student s3 = new Q05_Student("2");
		
		System.out.println(s1.equals(s2));	// equals() 오버라이드 하기전 false , 후 true 반환
		System.out.println(s1.equals(s3));
		
		HashSet<Q05_Student> hashSet = new HashSet<Q05_Student>();
		
		hashSet.add(new Q05_Student("1"));
		hashSet.add(new Q05_Student("1"));
		hashSet.add(new Q05_Student("2"));
		hashSet.add(new Q05_Student("3"));
		
		System.out.println("저장된 Student 수 : " + hashSet.size());
		
	}

}
