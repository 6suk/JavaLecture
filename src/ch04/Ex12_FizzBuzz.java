package ch04;

public class Ex12_FizzBuzz {

	public static void main(String[] args) {
		// 3의 배수 fizz
		// 5의 배수 buzz
		// 3과 5의 배수 fizzbuzz

		String result = "";
		for (int i = 1; i <= 100; i++) {
			if (i % 15 == 0) {
				result = i + "= FizzBuzz";
				System.out.println(result);
			} else if (i % 3 == 0) {
				result = i + "= Fizz";
				System.out.println(result);
			} else if (i % 5 == 0) {
				result = i + "= Buzz";
				System.out.println(result);
			} else {
				System.out.println(i);
			}
		}

	}
}