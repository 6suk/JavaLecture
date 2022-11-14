package ch09;

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println("=== A 클래스 중첩 인스턴스 멤버 클래스 ===");
		A.B b = a.new B();
		b.field1 = 5;
		b.method1();
		
		System.out.println("=== A 클래스 중첩 정적 멤버 클래스 ===");
		A.C c = new A.C();
		c.field1 = 3;
		c.field2 = 7;
		c.method1();
		c.method2();
		
		System.out.println("=== A 클래스 중첩 로컬 클래스 ===");
		a.method();
		
		
	}

}
