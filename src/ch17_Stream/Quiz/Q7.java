package ch17_Stream.Quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q7 {

	public static void main(String[] args) {
		List<Member2> list = new ArrayList<>();
		list.add(new Member2("홍길동", "개발자"));
		list.add(new Member2("김나리", "디자이너"));
		list.add(new Member2("신용권", "개발자"));
		
//		/** 답 작성 코드 */
//		list.stream()
//			.filter(x -> x.getJob().equals("개발자"))
//			.forEach(x -> System.out.println(x.getName()));
		
		/**Collectors를 이용한 답**/
		List<Member2> developers = list.stream()
			.filter(m -> m.getJob().equals("개발자"))
			.collect(Collectors.toList());
		
		developers.stream()
		.forEach(m -> System.out.println(m.getName()));
		
	}
	

}
