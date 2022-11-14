package ch17_Stream_Self;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StringArray {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("고뚱이");
		list.add("정시케");
		list.add("고시케");
		
		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));
		System.out.println();
		
		list.stream().sorted().forEach(s-> System.out.println(s));
	}

}
