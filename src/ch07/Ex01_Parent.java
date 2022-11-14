package ch07;

public class Ex01_Parent {
	int parenInt;
	
	Ex01_Parent() {}
	
	Ex01_Parent(int parenInt) {
		super();
		this.parenInt = parenInt;
	}

	void parentMethod() {
		System.out.println(parenInt);
	}
}
