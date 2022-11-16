package ch10.Ex12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MemberSevice memberSevice = new ArrayMemberSevice();
		memberSevice.register("10001", "12345", "홍길동");
		memberSevice.register("10001", "12345", "홍자바");
		memberSevice.register("10002", "123456", "이순신");
		memberSevice.register("10003", "1234567", "고예림");
		memberSevice.register("10004", "12345678", "바보");
		memberSevice.register("10005", "123456789", "안녕");
//		member.printAllMembers();

		System.out.println("======================================== ");
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 입력 > ");
		String id = sc.nextLine();
		System.out.print("패스워드 입력 > ");
		String password = sc.nextLine();

//		boolean result = memberSevice.login(id, password);
		
		try {
			memberSevice.login(id, password);
		} catch (NotExistIdException | WrongPasswordException e) {
//		} catch (RuntimeException e) {	// 가능하다
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
