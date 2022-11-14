package ch14_lambda;

import java.util.function.Consumer;

public class Ex02_AgumentsMain {
	public static void main(String[] args) {
		Ex02_MyFunctionalInterface fi;
		
		fi = (x) -> {
			int result = x * x;
			System.out.println(result);
		};
		fi.method(3);
		
		fi = x -> System.out.println(x * x); /** 중요 !! */
		
		Consumer<Integer> c = x -> System.out.println(x * x);
		c.accept(4);
		
		
	}
}
