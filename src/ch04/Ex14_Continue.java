package ch04;

public class Ex14_Continue {

	public static void main(String[] args) {
		// 1에서 100까지 3의 배수를 제외한 합계

		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				continue; // 실행하지 않고 증감문으로 이동
			}
			sum += i;
		}
		System.out.println(sum);

		// 100이하 양의 정수에서 3의 배수의 합
		int sum3 = 0;
		for (int i = 3; i <= 100; i += 3) {
			sum3 += i;
		}
		System.out.println(5050 - sum3);

	}

}
