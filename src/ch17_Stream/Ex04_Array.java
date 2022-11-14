package ch17_Stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * 리스트로부터 Stream을 가져옴
 *
 */
public class Ex04_Array {

	public static void main(String[] args) {
		String[] strArr = {"홍길동","김자바","박객체"};
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(x -> System.out.println(x));
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(x -> System.out.println(x));
		
	}

}
