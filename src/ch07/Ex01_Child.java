package ch07;

public class Ex01_Child extends Ex01_Parent{	//클래스 상속
	int childInt;
	
	Ex01_Child() {}
	
	Ex01_Child(int childInt) {
	super(childInt *2);	//부모 생성자를 부르는 것	
	this.childInt = childInt;
}

	void chileMethod() {
		System.out.println(childInt);
	}
}
