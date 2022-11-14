package ch07;

public abstract class Ex21_Phone { // 추상클래스
	public String owner;

	public Ex21_Phone(String owner) {
		super();
		this.owner = owner;
	}

	void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}

class SmartPhone extends Ex21_Phone {

	SmartPhone(String owner) {
		super(owner);

	}

	void intSearch() {
		System.out.println("인터넷을 검색합니다.");
	}

}