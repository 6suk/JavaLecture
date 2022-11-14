package ch15_Collection_Quiz;

import java.util.ArrayList;
import java.util.List;

public class Q07_BoardDao {
	
	/** 답 코드 작성 */
	public List<Q07_Board> getBoardList() {
		List<Q07_Board> list = new ArrayList<>();
		for (int i = 1; i <= 3; i++)
			list.add(new Q07_Board("제목" + i, "내용" + i));
		return list;
	}

}
