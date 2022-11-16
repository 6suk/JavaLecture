package ch15_Collection.Self;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();

		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		// 같은 키는 2개 있을 수 없다. value 값은 덮어쓰기된다.
		map.put("001", "kang");

		// map에 저장된 자료의 수 출력
		System.out.println(map.size()); // 3 출력

		// 키 값이 001,002,003인 값을 꺼내 출력
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		System.out.println(map.get("003"));

		// map에 저장된 모든 Key들을 Set자료 구조로 꺼냄
		Set<String> keys = map.keySet();

		// set 자료구조에 있는 모든 Key를 꺼내기 위해 Iterator 구하기
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			// key 꺼내기
			String key = iter.next();
			// key에 해당하는 value 꺼내기
			String value = map.get(key);
			// key와 value 출력하기
			System.out.println(key + " : " + value);

		}
	}
}
