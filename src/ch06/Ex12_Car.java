package ch06;

public class Ex12_Car {
	String company;
	String model;
	String color;
	int maxSpeed; // 필드 선언

	void printField() {
		System.out.printf("%s + %s + %s + %d%n", this.company, this.color, this.model, this.maxSpeed);
	}

	Ex12_Car() {
	} // 기본생성자

	Ex12_Car(String company) {
		this.company = company;
	} // 직접 선언 (매개변수선언)

	Ex12_Car(String company, String model) {
		this(company, model, "검정색", 200);	// 디폴트 값으로 설정할 수 있음.
	} // 생성자 선언 source > Generate Constructor Using Fields
	
	Ex12_Car(String company, String model, String color) {
		this(company, model, "검정색", 200);
	}
	
	Ex12_Car(String company, String model, String color, int maxSpeed) {	//요게 있어야 ↑ 위에 생성자가 오류가 안남
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Ex12_Car [company=" + company + ", model=" + model + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	} // source > Generate ToString()
}
