package ch15_Collection.Quiz;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q09_Main {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);

		String name = null; /** 최고 점수를 받은 아이디 저장 */
		int maxScore = 0; /** 최고 점수 저장 */
		int totalScore = 0; /** 점수 합계 저장 */

		
		/** 답 코드 작성 */
		Iterator<String> keyset = map.keySet().iterator();
		while (keyset.hasNext()) {
			String k = keyset.next();
			Integer v = map.get(k);
			if (v > maxScore) {
				maxScore = v;
				name = k;
			}
			totalScore += v;
		}
		System.out.println("최고 점수 받은 아이디 : " + name);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("점수 합게 : " + totalScore);
		
	
		


	}
}
