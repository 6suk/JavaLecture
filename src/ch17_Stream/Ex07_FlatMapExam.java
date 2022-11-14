package ch17_Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex07_FlatMapExam {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("this is java");
		list.add("i am a best developer");

		list.stream()
		.flatMap(data -> Arrays.stream(data.split(" "))
				/**String[] 배열을 Stream<String>으로 만듬*/
				)
		.forEach(x -> System.out.println(x));
		
		List<String> flatMap = list.stream()
		.map(a -> a.split(" "))
		.flatMap(Arrays :: stream)
		.collect(Collectors.toList());
		
		System.out.println("flatMap사용");
		System.out.println(flatMap);
		
		

		List<String> list2 = Arrays.asList("10, 20, 30", "40, 50");
		list2.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				intArr[i] = Integer.parseInt(strArr[i].trim());
				/**int[] 배열을 IntStream으로 만듬*/
			}
			return Arrays.stream(intArr);
		}).forEach(x -> System.out.println(x));
		
		
	}

}
