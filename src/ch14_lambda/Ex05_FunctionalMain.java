package ch14_lambda;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex05_FunctionalMain {
	public static void main(String[] args) {

		Consumer<Integer> c = i -> System.out.println(i * i);
		c.accept(4);

		Supplier<Integer> s = () -> (int) (Math.random() * 6) + 1;
		System.out.println(s.get());

		Function<Integer, Integer> f = i -> i * i;
		System.out.println(f.apply(3));

		BiPredicate<Integer, Integer> bp = (x, y) -> x == y * y;
		System.out.println(bp.test(4, 2));

		Predicate<Integer> p = x -> x % 2 == 0;
		System.out.println(p.test(3));

	}
}
