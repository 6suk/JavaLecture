package ch17_Stream;

import java.util.stream.IntStream;
	
public class Ex05_Range {
	public static int sum;
	
	public static void main(String[] args) {
		IntStream stream = IntStream.range(1, 10);
		stream.forEach(x -> System.out.println(x));
		System.out.println();
		stream = IntStream.rangeClosed(1, 10);
		stream.forEach(x -> System.out.println(x));
		
		stream = IntStream.rangeClosed(1, 100);
		stream.forEach(i -> sum += i);
		System.out.println(sum);
		
	}
}
