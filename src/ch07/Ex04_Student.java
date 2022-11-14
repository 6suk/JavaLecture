package ch07;

public class Ex04_Student extends Ex04_Person{
	String major;
	
	Ex04_Student(String name, String gender, int age, String major) {
		super(name, gender, age);	// 부모에서 가져올 매개변수 입력
		this.major = major;
	}

	void study() {
		System.out.println("공부하는 중");
	}

	@Override
	public String toString() {
		return "Ex04_Student [major=" + major + ", name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
}
