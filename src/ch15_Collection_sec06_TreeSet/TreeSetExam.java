package ch15_Collection_sec06_TreeSet;

import java.util.NavigableSet;
import java.util.Random;
import java.util.TreeSet;

public class TreeSetExam {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		Random ran = new Random();

		scores.add(ran.nextInt(100) + 1);
		scores.add(ran.nextInt(100) + 1);
		scores.add(ran.nextInt(100) + 1);
		scores.add(ran.nextInt(100) + 1);
		scores.add(ran.nextInt(100) + 1);
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(90);

		System.out.println("기본 오름차순 정렬 ▲ ");
		scores.forEach(x -> System.out.print(x+" "));
		System.out.println();

		System.out.println("- 가장 낮은 점수(first) : " + scores.first());
		System.out.println("- 가장 높은 점수 : " + scores.last());
		System.out.println("- 95점 아래 점수 : " + scores.lower(95));
		System.out.println("- 95점 위의 점수 : " + scores.higher(95));
		System.out.println("- 95점이거나 바로 아래 점수 : " + scores.floor(95));
		System.out.println("- 85점이거나 바로 위의 점수 : " + scores.ceiling(85));
		System.out.println();
		
		/** 내림차순 정렬 */
		NavigableSet<Integer> desending = scores.descendingSet();
		System.out.println("내림차순 정렬 ▼ ");
		desending.forEach(x -> System.out.print(x+" "));
		System.out.println();
		System.out.println("가장 큰 점수(first) : " + scores.first());
		System.out.println();
		
		/** 범위검색 (80 <= x ) */
		NavigableSet<Integer> rangeSet;
		rangeSet = scores.tailSet(80, true);
		System.out.print("80 <= x : ");
		rangeSet.forEach(x -> System.out.print(x+" "));
		System.out.println();
		
		/** 범위검색 (80 <= x < 90) */
		rangeSet = scores.subSet(80, true, 90, false);
		System.out.print("80 <= x < 90 : ");
		rangeSet.forEach(x -> System.out.print(x+" "));
		System.out.println();
		

	}
}
