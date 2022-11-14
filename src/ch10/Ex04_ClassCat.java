package ch10;

public class Ex04_ClassCat {

	public static void main(String[] args) {
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
	}

}

class Animal{}
class Cat extends Animal{}
class Dog extends Animal{}