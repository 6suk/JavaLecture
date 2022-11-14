package ch08_ex13;

/*
 *	기존 MyInterface를 구현한 클래스
 */


public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClass B - method1");		
	}

	@Override
	public void method2() {
		System.out.println("MyClass B - Merhod2");
	}


}
