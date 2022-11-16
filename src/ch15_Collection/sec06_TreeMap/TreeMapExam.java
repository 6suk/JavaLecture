package ch15_Collection.sec06_TreeMap;

import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExam {
	public static void main(String[] args) {
//		TreeMap<String, Integer> tm = new TreeMap<>((o1,o2)->o2.compareTo(o1)); // 내림차순
		TreeMap<String, Integer> tm = new TreeMap<>();

		tm.put("apple", 10);
		tm.put("forever", 60);
		tm.put("description", 40);
		tm.put("ever", 50);
		tm.put("zoo", 80);
		tm.put("base", 20);
		tm.put("guess", 70);
		tm.put("cherry", 30);

		tm.forEach((k, v) -> System.out.println(k + ":" + v));
		System.out.println();
		
		System.out.println(tm.firstEntry());
		
		Entry<String, Integer> entry;
		entry = tm.firstEntry();
		System.out.println("제일 앞 단어 : " + entry.getKey() + " - " + entry.getValue());
		entry = tm.lastEntry();
		System.out.println("제일 뒤 단어 : " + entry.getKey() + " - " + entry.getValue());
		entry = tm.lowerEntry("ever");
		System.out.println("ever 앞 단어 : " + entry.getKey() + " - " + entry.getValue());

		// 범위 검색
		System.out.println("C ~ h 사이의 단어 검색");
		NavigableMap<String, Integer> reangeMap = tm.subMap("c", true, "h", false);
		reangeMap.forEach((x, y) -> System.out.println(x + " : " + y));

	}
}
