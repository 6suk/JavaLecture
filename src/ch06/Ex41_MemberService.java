package ch06;

public class Ex41_MemberService {
	private static Ex41_Member[] memberList = new Ex41_Member[10];

	void register(String id, String password, String name) {	// 중복확인이 빠졌다.
		Ex41_Member member = findById(id);
		if(member != null) {
			System.out.println("중복된 id입니다.");
			return;
		}
		
		member = new Ex41_Member(id, password, name);
		for (int i = 0; i < memberList.length; i++) {
			if (memberList[i] == null) {
				memberList[i] = member;
				System.out.println(name + "님 " + id + "로 회원가입 되었습니다.");
				break;
			}
		}

	}
	
	
//	void register(String id, String password, String name) {	// 중복확인이 빠짐
//		Ex41_Member member = new Ex41_Member(id, password, name);
//		for (int i = 0; i < memberList.length; i++) {
//			if (memberList[i] == null) {
//				memberList[i] = member;
//				System.out.println(name + "님 " + id + "로 회원가입 되었습니다.");
//				break;
//			}
//		}
//
//	}

	void printAllMembers() {
		for (Ex41_Member member : memberList) {
			if (member == null) {
				break;
			}
			System.out.println(member);
		}
	}

	static Ex41_Member findById(String id) {
		for (Ex41_Member member : memberList) {
			if (member == null) // 배열에서 찾지 못한 경우
				break;
			if (id.equals(member.getId())) {
				return member;
			}
		}
		return null;
	}

	static boolean login(String id, String password) {
		Ex41_Member member = findById(id);
		if (member == null) {
			return false;
		} else {
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 로그인 되었습니다.");
				return true;
			} else {
				return false;
			}
		}
	}

	static void logout(String id) {
		Ex41_Member member = findById(id);
		if (member != null)
			System.out.println(member.getName() + "님 로그아웃 되었습니다.");
		System.out.println("로그아웃 완료");
	}

}
