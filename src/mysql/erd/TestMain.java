package mysql.erd;

import java.io.*;

import org.mindrot.jbcrypt.BCrypt;

public class TestMain {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static UsersDao dao = new UsersDao();

	public static void main(String[] args) throws IOException {
		
		System.out.print("아이디 입력 > ");
		String uid = br.readLine();
		System.out.print("비밀번호 입력 > ");
		String pwd = br.readLine();
		br.close();
		login(uid, pwd);
		
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
