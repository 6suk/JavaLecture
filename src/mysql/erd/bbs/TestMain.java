package mysql.erd.bbs;

import java.io.*;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

public class TestMain {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static UsersDao uDao = new UsersDao();
	public static BoardDao bDao = new BoardDao();
	public static ReplyDao rDao = new ReplyDao();
	public static boolean loginresult = false;
	public static String userid = "";

	public static void main(String[] args) throws IOException {
		boolean run = true;
		while (run) {
			switch (selectNo()) {
			case 1:
				login();
				break;
			case 2:
				boardList();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				System.out.println("  [프로그램 종료]");
				br.close();
				run = false;
				break;
			default:
				System.out.println("  [오류] : 1에서 5까지의 숫자만 입력하세요!");
			}

		}
	}

	/** login */
	public static boolean login() throws IOException {

		while (true) {
			System.out.print("아이디 입력 > ");
			String uid = br.readLine();
			System.out.print("비밀번호 입력 > ");
			String pwd = br.readLine();

			Users user = uDao.getUserInfo(uid);

			if (uid.equals("0") && pwd.equals("0"))
				return false;

			if (!uid.equals(user.getUid())) {
				System.out.println("  [오류] 존재하지 않는 아이디입니다.");
			} else {
				if (BCrypt.checkpw(pwd, user.getPwd())) {
					System.out.println("Login 성공");
					userid = user.getUid();
					loginresult = true;
					return true;
				} else {
					System.out.println("  [오류] 패스워드가 잘못되었습니다.");
				}
			}
		}
	}

	/** 게시판 */
	public static void boardList() throws IOException {
		List<Bbs> bbslist = bDao.getBbsList(0);
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("  ● 게시판 목록");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.printf(" 글번호\t| 제목\t\t| 작성자\t\t| 작성일 / 조회수 / 댓글수 \n");
		System.out.println("-------------------------------------------------------------------");
		bbslist.forEach(System.out::println);
		System.out.println();
		boardPlus();
	}

	public static void boardPlus() throws IOException {
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("  글번호. 게시물 보기 | #. 게시글 작성 | *. 되돌아가기");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.print("  - 선택 > ");
		String Select = br.readLine();
		int a = Integer.valueOf(Select);
		switch (Select) {
		case "#":
			if (loginresult) {
				System.out.print("  - 제목 > ");
				String title = br.readLine();
				System.out.print("  - 내용 > ");
				String content = br.readLine();
				Board b = new Board(title, content, userid);
				bDao.insertBoard(b);
			} else {
				System.out.println("  [오류] 로그인을 해주세요!");
				login();
			}

			break;
		case "*":
			return;
		default:
			if (userid == null || userid.isEmpty())
				bDao.viewCount(a);
			Board b = bDao.getBoardInfo(a);
			System.out.println(b);
		}
	}

	public static void viewCountMain(Board b) {
		int bid = b.getBid();
		String uid = b.getUid();
		System.out.println(bid + uid);
		System.out.println(userid);
		// id가 다르면 조회수 count++
		if (userid.equals(null))
			bDao.viewCount(bid);
	}

<<<<<<< HEAD
<<<<<<< HEAD
	public static void boardInfo(int bid) throws IOException {
		Board b = bDao.getBoardInfo(bid);
		List<Reply> list = rDao.ReplyList(bid);
		System.out.println();
		System.out.println(b);
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("  ● 댓글");
		System.out.println("---------------------------------------------------------------------------------------------");
		list.forEach(System.out::println);
		
		System.out.println("---------------------------------------------------------------------------------------------");
		System.out.println("  ● 1.댓글작성 | 2. 게시판");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.print("  - 선택 > ");
		int Select = Integer.parseInt(br.readLine());
		switch (Select) {
		case 1:
			if (loginresult) {
				System.out.print("  - 내용 > ");
				String content = br.readLine();
				Reply r = new Reply(content, userid, bid);
				rDao.insertReply(r);
				break;
			} else {
				System.out.println("  [오류] 로그인을 해주세요!");
				login();
			}
			break;
		case 2:
			boardList();
			return;
		default:
			break;
		}
		
		
=======
	public static int selectNo() throws NumberFormatException, IOException {
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("  1.로그인 | 2.게시판 | 3.정보수정 | 4.고객탈퇴 | 5.종료");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.print("  - 선택 > ");
		return Integer.parseInt(br.readLine());
>>>>>>> parent of b7adf71 (feat : board / reply 기능 추가)
=======
	public static int selectNo() throws NumberFormatException, IOException {
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.println("  1.로그인 | 2.게시판 | 3.정보수정 | 4.고객탈퇴 | 5.종료");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.print("  - 선택 > ");
		return Integer.parseInt(br.readLine());
>>>>>>> parent of b7adf71 (feat : board / reply 기능 추가)
	}

}
