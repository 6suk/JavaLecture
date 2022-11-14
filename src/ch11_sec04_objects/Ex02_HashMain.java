package ch11_sec04_objects;

public class Ex02_HashMain {

	public static void main(String[] args) {
		Student s1 = new Student(1, "박자바");
		Student s2 = new Student(2, "박자바");
		Student s3 = new Student(3, "홍자바");
		Student s4 = new Student(2, "이자바");
		Student s5 = new Student(2, "이자바");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
	}

}
