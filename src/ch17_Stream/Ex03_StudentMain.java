package ch17_Stream;

import java.util.ArrayList;
import java.util.List;

public class Ex03_StudentMain {

	public static void main(String[] args) {
		List<Ex03_Student> list = new ArrayList<>();
		list.add(new Ex03_Student("홍길동", 10));
		list.add(new Ex03_Student("신용권", 20));
		list.add(new Ex03_Student("유미선", 30));
		
		double avg = list.stream()
		.mapToInt(name -> name.getScore())
		.average()
		.getAsDouble();
		
		System.out.println("평균 점수 : " + avg);
		
	}

}
