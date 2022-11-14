package ch09;

public class A {
	A() {
		System.out.println("A 객체가 생성됨.");
	}

	void method() {
		class D {
			D() {
				System.out.println("D 객체가 생성됨.");
			}
			int field1;
			void method1() {

			}
		}
	}

	/* 인스턴스 멤버 클래스 */
	class B {
		B() {
			System.out.println("B 객체가 생성됨.");
		} // 생성자

		int field1; // 인스턴스 필드

		void method1() {
		} // 인스턴스 메소드
	}

	/* 정적 멤버 클래스 */
	static class C {
		C() {
			System.out.println("C 객체가 생성됨.");
		}

		int field1;
		static int field2;

		void method1() {

		}

		static void method2() {

		}

	}

}
