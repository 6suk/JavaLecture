package ch15_Collection_sec01_arrayList;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExam {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("고뚱이", 7);
		map.put("김시케", 2);
		map.put("정시케", 2);
		map.put("고뚱이", 8); // 키 값이 같기 때문에 제일 마지막에 저장한 값 저장

		int size = map.size();
		System.out.println(size);

		// 키로 값 얻기
		String key = "고뚱이";
		int value = map.get(key);
		System.out.println("=== 키로 값 얻기 .get() ===");
		System.out.println(key + " : " + value);
		System.out.println();

		/** keySet 컬렉션을 얻고, 반복해서 키와 값을 얻기 */
		Set<String> keyset = map.keySet(); // 모든 키 값을 Set 객체에 담아 리턴
		Iterator<String> iter = keyset.iterator();
		
		System.out.println("=== keySet 컬렉션을 얻고, 반복해서 키와 값을 얻기 ===");
		while (iter.hasNext()) {
			String k = iter.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		System.out.println("=== keySet 컬렉션을 얻고, 반복해서 키와 값을 얻기2 ===");
		/** 합쳐버릴 수 있다 */
		Iterator<String> keys = map.keySet().iterator();
		while (keys.hasNext()) {
			String k = keys.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
		

		/** for-each문으로 구하기 **/
		System.out.println("=== for-each문으로 구하기 ===");
		keyset.forEach(x -> System.out.println(x + " : " + map.get(x)));

		/**엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기*/
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIter = entrySet.iterator();
		System.out.println("=== 엔트리 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기 ===");
		while (entryIter.hasNext()) {
			Entry<String, Integer> entry = entryIter.next();
			String k = entry.getKey();
			Integer v = entry.getValue();
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		System.out.println("====엔트리 향상된 for문===");
		for(Map.Entry<String, Integer> entry : map.entrySet())
			System.out.println(entry.getKey() +" " + entry.getValue());
		
		System.out.println("====엔트리 for-each문===");
		entrySet.forEach(x -> System.out.println(x.getKey()+" " + x.getValue()));
		
		map.put("정현철", 30);
		
		/** for-each문으로 구하기2 **/
		System.out.println("=== for-each문으로 구하기2 ===");
		map.forEach((k,v)-> System.out.println(k + " : " + v));
		
		map.remove("정현철");	//키로 엔트리 삭제
		
		

		
		
		
	}

}
