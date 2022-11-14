package ch17_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Ex07_MapExam02 {

	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5};
		
		IntStream stream = Arrays.stream(intArr);
		stream.asDoubleStream()
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		stream = Arrays.stream(intArr);
		stream.boxed()
		.forEach(x -> System.out.println(x.intValue()));
		
	}

}
