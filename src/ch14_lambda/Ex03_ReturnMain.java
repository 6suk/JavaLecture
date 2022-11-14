package ch14_lambda;

import java.util.function.BiFunction;

public class Ex03_ReturnMain {
	public static void main(String[] args) {
		Ex03_MyFunctionalInterface fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(4, 5));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(3, 4));

		fi = (x, y) -> x + y; /** 중요! */
		System.out.println(fi.method(3, 4));

		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(3, 4));

		BiFunction<Integer, Integer, Integer> f = (x, y) -> x + y;
		f.apply(5, 5);

	}

	static int sum(int a, int b) {
		return a + b;
	}

}
