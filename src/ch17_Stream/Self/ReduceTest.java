package ch17_Stream.Self;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length <= s2.getBytes().length)
			return s1;
		else
			return s2;
	}
	
}

public class ReduceTest {
	public static void main(String[] args) {
		String[] str = { "안녕~~~~~~~~~~~~!!!", "hello", "Good morning", "반갑습니다" };

		/***
		 * 람다식을 이용한 reduce
		 */
		String a = Arrays.stream(str).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length)
				return s1;
			else
				return s2;
		});
		System.out.println(a);
		
		/***
		 * class를 이용한 reduce
		 */
		String b = Arrays.stream(str).reduce(new CompareString()).get();
		System.out.println(b);

	}
}
