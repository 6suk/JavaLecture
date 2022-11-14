package ch06;

public class Ex03_overLoading {

	public static void main(String[] args) {
		int min = getMin(3, 4, 5); // alt + shift + R = 메소드 rename
		System.out.println(min);
		System.out.println(getMin(10, 20, 5));
		System.out.println(getMin(10.1, 20.2, 5.0));
	}

	static int getMin(int a, int b) {	// 매개변수 갯수가 다른 경우
		return getMin(a, a, b);
	}

	static int getMin(int a, int b, int c) { // 기본	
		int min = (a < b) ? a : b;
		min = (min < c) ? min : c;

		return min;
	}

	static double getMin(double a, double b, double c) {	//타입이 다른경우.
		double min = (a < b) ? a : b;
		min = (min < c) ? min : c;

		return min;
	}
}
