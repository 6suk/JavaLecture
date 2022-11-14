package ch15_Collection_sec01_arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex04_Iteration {
	public static void main(String[] args) {
		List<Board> list = new ArrayList<>();

		// 객체추가
		for (int i = 1; i <= 5; i++) {
			list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
		}
		
		// Java 고전적인 방법
		Iterator<Board> iter = list.iterator();
		while (iter.hasNext()) {
			Board board = (Board) iter.next();
			System.out.println(board);
		}
		
		/** forEach문 - Lambda식 사용 */
		list.forEach(b -> System.out.println(b));
		list.forEach(b -> System.out.println(b.getSubject()));
		
	}
}
