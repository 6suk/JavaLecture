package ch08_ex13;

public class Main {

	public static void main(String[] args) {
		System.out.println("===== MyI = McA =====");
		MyInterface mi1 = new MyClassA();
		mi1.method1();
		mi1.method2();
		System.out.println(mi1);
		
		System.out.println("===== MyI = McB =====");
		MyInterface mi2 = new MyClassB();
		mi2.method1();
		mi2.method2();
		System.out.println(mi2);
		
		System.out.println("===== McB = McB =====");
		MyClassB b1 = new MyClassB();
		b1.method1();
		b1.method2();
		System.out.println(b1);
		
		System.out.println("===== McA = McA =====");
		MyClassA a1 = new MyClassA();
		a1.method1();
		a1.method2();
		System.out.println(a1);
	}

}
