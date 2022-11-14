package ch14_lambda;

import java.util.function.IntPredicate;

public class Ex08_AndOrNegate {
	public static void main(String[] args) {
		IntPredicate pA = a -> a % 2 == 0;
		IntPredicate pB = a -> a % 3 == 0;
		IntPredicate pAB = pA.and(pB);
		
		System.out.println(pA.test(5));
		System.out.println(pB.test(6));
		System.out.println(pAB.test(9));
		
	}
}
