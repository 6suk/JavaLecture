package ch17_Stream.Quiz;

import java.util.ArrayList;
import java.util.List;

public class Q6 {

	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		list.add(new Member("홍길동", 30));
		list.add(new Member("신용권", 40));
		list.add(new Member("김자바", 26));
		
		/** 답 작성 코드 */
		double avg = list.stream()
				.mapToInt(x -> x.getAge())
				.average()
				.getAsDouble();
		System.out.println("평균나이 : " + avg);
		
	}
}

