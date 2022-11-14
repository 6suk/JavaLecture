package ch08_ex13;

/*
 * 1. method1();를 만들고
 * 2. method2();를 만들고 싶을 경우
 */

public interface MyInterface {
	abstract void method1();
	
	public default void method2() {	//public default는 접근제한자가 아님
		System.out.println("MyInterface - Merhod2");
	}
}
