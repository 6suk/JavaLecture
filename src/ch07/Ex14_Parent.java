package ch07;

public class Ex14_Parent {
	String name = "부모";
	


	void parentMethod() {
		System.out.println("Parent : " + name);
	}
}

class Son extends Ex14_Parent {
	String sonName = "아들";

	void sonMethod() {
		System.out.println("Son : " + sonName);
	}

	@Override
	void parentMethod() {
		System.out.println("Son : " + name);
	}

}

class Daughter extends Ex14_Parent {
	String doughterName = "딸";

	void daughterMethod() {
		System.out.println("Doughter : " + doughterName);
	}

	@Override
	void parentMethod() {
		System.out.println("Doughter : " + name);
	}

}