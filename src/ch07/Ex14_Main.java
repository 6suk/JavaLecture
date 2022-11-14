package ch07;

public class Ex14_Main {

	public static void main(String[] args) {
		Ex14_Parent parent = new Ex14_Parent();
		Son son = new Son();
		Daughter doughter = new Daughter();
		
		System.out.println("===자동 타입 변환===");
		parent = son;	// 자동 타입 변환
		parent.parentMethod();
		
//		parent = doughter;
//		parent.parentMethod();
		
		
		System.out.println("===강제 타입 변환===");
//		doughter = (Daughter)parent;	// 강제 타입변환
//		doughter.daughterMethod();
		
		son = (Son)parent;	// ClassCastException 왜지?
		son.sonMethod();
		
		
		System.out.println("===강제 타입 변환 올바른 방법===");
		if (parent instanceof Daughter) {
			doughter = (Daughter)parent;
			doughter.daughterMethod();
		}
		if (parent instanceof Son) {
			son = (Son)parent;
			son.sonMethod();
		}
		
	}

}
