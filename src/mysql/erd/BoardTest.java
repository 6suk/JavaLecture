package mysql.erd;

import java.util.List;

public class BoardTest {
	
//	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static BoardDao dao = new BoardDao();
	
	public static void main(String[] args) {
		
//		Board c1 = new Board("게시글1", "본문1", "4567");
//		dao.insertBoard(c1);
//		
//		Board c2 = new Board("게시글1", "본문1", "admin");
//		dao.insertBoard(c2);
//		
//		Board b = new Board("수정", "내용수정", 1);
//		dao.updateBoard(b);
//		
//		dao.delBoard(1);
		
		dao.viewCount(2);
		List<Board> list = dao.getBoardList();
		list.forEach(x -> System.out.println(x));
		
		System.out.println(dao.getCount());
		
		List<Bbs> bbslist = dao.getBbsList(0);
		bbslist.forEach(x -> System.out.println(x));
		
		
	}

}
