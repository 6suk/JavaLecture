package ch10.Ex12;

public class ArrayMemberSevice implements MemberSevice {
	private Member[] memberList = new Member[10];

	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if (member != null) {
			System.out.println("중복된 id입니다.");
			return;
		}

		member = new Member(id, password, name);
		for (int i = 0; i < memberList.length; i++) {
			if (memberList[i] == null) {
				memberList[i] = member;
				System.out.println(name + "님 " + id + "로 회원가입 되었습니다.");
				break;
			}
		}
	}

	@Override
	public void printAllMembers() {
		for (Member member : memberList) {
			if (member == null) {
				break;
			}
			System.out.println(member);
		}
	}

	@Override
	public Member findById(String id) {
		for (Member member : memberList) {
			if (member == null) // 배열에서 찾지 못한 경우
				break;
			if (id.equals(member.getId())) {
				return member;
			}
		}
		return null;
	}

	@Override
//	public boolean login(String id, String password) throws NotExistIdException, WrongPasswordException {
	public boolean login(String id, String password) throws RuntimeException { // 이것도 가능 (다형성)
		Member member = findById(id);
		if (member == null) {
			// id에 해당하는 member가 없는 경우
			throw new NotExistIdException(id + " : 아이디를 찾을 수 없습니다.");
//			return false; // NotExistIdException
		} else {
			if (password.equals(member.getPassword())) {
				System.out.println(member.getName() + "님 로그인 되었습니다.");
				return true;
			} else {
				// 패스워드가 틀린 경우
				throw new WrongPasswordException("비밀번호가 잘못되었습니다.");
//				return false; // WrongPasswordException
			}
		}
	}

	@Override
	public void logout(String id) {
		Member member = findById(id);
		if (member != null)
			System.out.println(member.getName() + "님 로그아웃 되었습니다.");
		System.out.println("로그아웃 완료");
	}

}
