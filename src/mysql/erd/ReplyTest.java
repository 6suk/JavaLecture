package mysql.erd;

import java.util.List;

public class ReplyTest {

	public static void main(String[] args) {
		ReplyDao dao = new ReplyDao();
//		Reply r1 = new Reply("댓글달기1", "admin", 2);
//		Reply r2 = new Reply("댓글달기2", "kingcat", 2);
//		Reply r3 = new Reply("안녕~", "kingcat", 6);
//		Reply r4 = new Reply("반가워", "kingcat", 6);
//		
//		dao.insertReply(r1);
//		dao.insertReply(r2);
//		dao.insertReply(r3);
//		dao.insertReply(r4);
		
		dao.updateReply(new Reply(1, "댓글 수정"));
		dao.delReply(3);
		
		List<Reply> list = dao.ReplyList();
		list.forEach(x -> System.out.println(x));
		
		
	}

}
