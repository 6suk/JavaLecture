package ch03;

public class Ex03_Binary {

	public static void main(String[] args) {
		int a = 2000000000;
		int b = a * 2; // Overflow
		System.out.println(b);
		System.out.printf("%d, %d%n", Integer.MAX_VALUE, Integer.MIN_VALUE);
		System.out.println(safeAdd(a, a));

		int c = 3, d = 4;
		int res1 = c / d;
		System.out.println(res1); // (X) 0

		double res2 = c / d;
		System.out.println(res2); // (X) 0.0

		double res3 = c / (double) d;
		System.out.println(res3); // (O) 하나만 더블로 바꿔줘도 된다!

		System.out.println(4 / 3); // (X)
		System.out.println(4 / 3.); // (O) 실수로 나올때는 .을 붙여야한다!

		System.out.println(Double.NaN); // 0.0 / 0.0 부정
		System.out.println(0.0 / 0.0);

		System.out.println(Double.POSITIVE_INFINITY); // 3.0 / 0.0 불능
		System.out.println(3.0 / 0.0);

		/**
		 * 비교연산자
		 */

		System.out.println(3 == 3);
		System.out.println(3.0 == 3.0); // ★ 실수연산에서 비교 연산자 사용은 위험할 수 있다.
		System.out.println(3.0 == 1.2 + 3.3 - 1.5);
		System.out.println(Math.abs(3.0 - 1.2 + 3.3 - 1.5) < 1e-15);
		System.out.println(Math.abs(3.0 - (1.2 + 3.3 - 1.5)) < 1e-15);
		
		double d1 = 3.0;
		double d2 = 1.2 + 3.3 - 1.5;
		
		if(Double.compare(d1, d2) == 0) {
			System.out.println("d1과 d2는 같음");
		} else if(Double.compare(d1, d2) > 0) {
			System.out.println("d1이 d2보다 큼");
		} else if(Double.compare(d1, d2) < 0) {
			System.out.println("d1이 d2보다 작음");
		};
		

		/**
		 * 문자열 비교 - 문자열은 참조형
		 */

		String str1 = "홍길동"; // 리터럴로 문자열 할당 (Heap memory)
		String str2 = "홍길동";
		String str3 = new String("홍길동"); // 문자열 객체를 만들어서 할당 (Stack memory)
		String str4 = new String("ㅎㅎㅎ"); // 문자열 객체를 만들어서 할당 (Stack memory)
		System.out.println(str1 + str2 + str3);
		System.out.println(str1 == str2); // 값도 같고 같은 '기억 장소'라 True 출력
		System.out.println(str1 == str3); // 값은 같지만 다른 기억장소에 보관되어 False 출력
		System.out.println(str3 == str4); // 값도 달라 다른 기억장소에 보관되어 False 출력
		System.out.println(str1.equals(str3)); // ★ String 비교는 .equals() 사용

	}

	private static int safeAdd(int x, int y) {
		if (x > 0 && y > 0 && y > Integer.MAX_VALUE - x) {
			return 0;
		}
		if (x < 0 && y < 0 && y < Integer.MIN_VALUE - x) {
			return 0;
		}
		return x + y;
	} // method , 다른 언어에서는 함수
		// 비즈니스 로직

}
