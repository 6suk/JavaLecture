package ch07;

public class Ex04_Person {
	String name;
	String gender;
	int age;
	
//	Ex04_Person(){}
	
	Ex04_Person(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	
	void eat() {
		System.out.println("밥 먹는 중");
	}
	void sleep() {
		System.out.println("잠 자는 중");
	}
}
