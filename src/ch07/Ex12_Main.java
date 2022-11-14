package ch07;

public class Ex12_Main {

	public static void main(String[] args) {
		Cat cat = new Cat(); // 객체 생성
		cat.catField = 3;

		Animal animal = cat;
		animal.animalMethod();
		
		Animal animal2 = new Dog();
		animal2.animalMethod();
		
		cat.catMethod();

	}

}

class Animal {
	int animalField;
	
	void animalMethod() {
		System.out.println("Animal :" + animalField);
		System.out.println("Sound : 동물이 소리를 냅니다.");
	}
}

class Cat extends Animal {
	int catField;

	void catMethod() {
		System.out.println("Cat :" + catField);
	}

	@Override
	void animalMethod() {
		System.out.println("Cat :" + animalField);
		System.out.println("Sound : 야옹");
	}
}

class Dog extends Animal {
	int dogField;

	void catMethod() {
		System.out.println("Dog :" + dogField);
	}
	@Override
	void animalMethod() {
		System.out.println("Dog :" + animalField);
		System.out.println("Sound : 멍멍");
	}
}