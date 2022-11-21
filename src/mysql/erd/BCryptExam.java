package mysql.erd;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptExam {

	public static void main(String[] args) {
		String pwd = "456789adbd";
		
		/** 1-1. salt가 다르기 때문에 결과가 다르다. */
		String cryptedPwd = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd.length());
		System.out.println(cryptedPwd);
		
		/** 1-2. salt가 다르기 때문에 결과가 다르다. */
		String cryptedPwd2 = BCrypt.hashpw(pwd, BCrypt.gensalt());
		System.out.println(cryptedPwd2);
		System.out.println();
		
		/** 2. salt값이 동일하면 결과가 같다. */
		String salt = BCrypt.gensalt();
		System.out.println(salt);
		System.out.println(salt.length());
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println(BCrypt.hashpw(pwd, salt));
		System.out.println();
		
		/** 3. 패스워드가 동일한지 확인 */
		boolean result = BCrypt.checkpw(pwd, cryptedPwd);
		System.out.println(result);
		
	}

}
