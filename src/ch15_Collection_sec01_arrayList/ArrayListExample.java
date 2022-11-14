package ch15_Collection_sec01_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();

		// 객체추가
		for (int i = 1; i <= 5; i++) {
			list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		}
		// 저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();

//		for(Board a : list)
//			System.out.println(a);
//		System.out.println();

		System.out.println("For-each문");
		list.forEach(a -> System.out.println(a));
		System.out.println();

		// 객체 삭제
		list.remove(2);
		list.remove(2);

		for (Board a : list)
			System.out.println(a);
		System.out.println();
		
		/** Member 타입 리스트 정렬하기 */
		List<Member> list2 = new ArrayList<>();
		list2.add(new Member("고뚱이", 7));
		list2.add(new Member("고뚱이", 7));
		list2.add(new Member("고시케", 2));
		list2.add(new Member("정현철", 30));
		
		/**나이순 정렬*/
		System.out.println("나이순 정렬");
		list2.sort((x,y)-> x.age - y.age);
		list2.forEach(a -> System.out.println(a));
		
		/**이름순 정렬*/
		System.out.println("이름순 정렬");
		list2.sort((x,y)-> x.name.compareTo(y.name));
		list2.forEach(a -> System.out.println(a));
		
		list2.forEach(x -> System.out.println(x.age +","+ x.name));
		
	}
}
