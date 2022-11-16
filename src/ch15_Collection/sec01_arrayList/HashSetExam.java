package ch15_Collection.sec01_arrayList;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExam {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		//객체 저장
		set.add("고뚱이");
		set.add("고시케");
		set.add("정시케");
		set.add("고뚱이"); // 중복 저장 불가
		
		set.forEach((x -> System.out.println(x)));
		System.out.println(set.size());
		System.out.println();
		
		/** 해당 값 지우기 **/
		set.removeIf(x -> x.equals("정시케"));
		set.forEach((x -> System.out.println(x)));
		
		System.out.println();

		Set<Member> set2 = new HashSet<>();
		set2.add(new Member("고뚱이", 7));
		set2.add(new Member("고시케", 2));
		set2.add(new Member("고뚱이", 6));
		set2.add(new Member("고뚱이", 7));

		System.out.println(set2.size());
		
		/** for Each문으로 검색 */
		set2.forEach((x -> System.out.println(x)));
		set2.forEach((x -> System.out.println("이름 : " + x.name)));
		set2.forEach((x -> System.out.println("나이 : " + x.age)));
		
		/**Iterator로 검색*/
		Iterator<Member> iter = set2.iterator();
		while (iter.hasNext()) {
			Member member = (Member) iter.next();
			System.out.println(member.toString());
		}
		
		/** 주어진 객체가 저장되어 있는지 여부 */
		boolean a = set.contains("고뚱이");
		System.out.println(a);
		
		
		
	}
}
