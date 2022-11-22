package mysql.erd.bbs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.mindrot.jbcrypt.BCrypt;

import mysql.customer.DAO;

public class bbsMain {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static DAO userdao = new DAO();

	public static void main(String[] args) throws IOException {
		
		boolean run = true;
		while (run) {
			System.out.println("----------------------------------------------------------");
			System.out.println("  1.로그인 | 2.게시판 | 3.로그아웃 | 4.종료 ");
			System.out.println("----------------------------------------------------------");
			System.out.print("  - 선택 > ");
			int selectNo = Integer.parseInt(br.readLine());
			System.out.println();

			switch (selectNo) {
			case 1:
				break;
			case 2:
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
	public static void login(String uid, String pwd) {
		Users user = dao.getUserInfo(uid);
		if(!uid.equals(user.getUid()))
			System.err.println("존재하지 않는 아이디입니다.");
		else {
			if (BCrypt.checkpw(pwd, user.getPwd()))
				System.out.println("Login 성공");
			else 
				System.err.println("패스워드가 잘못되었습니다.");
		}
	}

}
