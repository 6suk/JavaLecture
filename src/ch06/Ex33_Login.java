package ch06;

public class Ex33_Login {

	public static void main(String[] args) {
		Ex33_MemberService member = new Ex33_MemberService();
		
		// hong, 12345 로그인 (정상로그인)
		boolean result = member.login("hong", "12345");
		if (result) {
			System.out.println(member.id + "님이 로그인 되었습니다.");
			member.logout("hong");
		} else {
			System.out.println("id 또는 Password가 올바르지 않습니다.");
			System.out.println("▶ 기입한 ID : " + member.id);
		}
		
		// hihihi, dfadfad45 로그인 (로그인오류)
		boolean result2 = member.login("hihihi", "dfadfad45");
		if (result2) {
			System.out.println(member.id + "님이 로그인 되었습니다.");
			member.logout("hong");
		} else {
			System.out.println("id 또는 Password가 올바르지 않습니다.");
			System.out.println("▶ 기입한 ID : " + member.id);
		}
	}
}
