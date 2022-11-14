package ch17_Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex08_SortExam {

	public static void main(String[] args) {
		List<Ex08_Student> stuList = new ArrayList<>();
		stuList.add(new Ex08_Student("홍길동", 10));
		stuList.add(new Ex08_Student("신용권", 20));
		stuList.add(new Ex08_Student("유미선", 30));
		
		/** 오름차순 정렬 */
		stuList.stream().sorted()
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		System.out.println();
		
		/** 내림차순 정렬 */
		stuList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
		
		System.out.println();
		
		/** 이름 오름차순 정렬 */
		stuList.stream()
		.sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
		.forEach(s -> System.out.println(s.getName() + ": " + s.getScore()));
	}

}
