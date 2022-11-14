package ch11;

import java.text.MessageFormat;

public class Ex17_MessageFormat {

	public static void main(String[] args) {
		String id = "admin";
		String name = "관리자";
		String tel = "010-2345-6789";
		
		String text = "회원 ID : {0}\n회원이름 : {1}\n전화번호 : {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
	}

}
