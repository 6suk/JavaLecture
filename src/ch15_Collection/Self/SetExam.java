package ch15_Collection.Self;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

	public static void main(String[] args) {
		// 중복도 없고, 순서도 없는 자료 구조
		Set<String> set1 = new HashSet<>();
		
		boolean a1 = set1.add("고뚱이");
		boolean a2 = set1.add("고식케");
		boolean a3 = set1.add("고식케");
		
		// 저장된 크기 출력
		System.out.println(set1.size());
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		// Set 자료 꺼내기
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String a = iter.next();
			System.out.println(a);
		}
		
	}

}
