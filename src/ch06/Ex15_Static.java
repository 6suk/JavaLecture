package ch06;

public class Ex15_Static {
	static double pi = 3.14159;
	static final double PI = 3.14159;	// final 지정시 대문자로
	int x;	// instance field
	
	static int power(int base, int exponent) {
		 int result = 1;
		 for(int i = 1; i <= exponent; i++) {
			 result *= base;
		 }
		return result;
	}
	
	int power2() {	//instance method
		int res = 1;
		 for(int i = 1; i <= x; i++) {
			 res *= 2;
		 }
		return res;
	}
	
}
// 객체를 사용하지 않고도 접근할 수 있는 필드
// 저장되는 곳이 힙이 아니다!