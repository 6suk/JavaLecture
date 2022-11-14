package ch08_Ex11;

public class ArrayMemberSevice implements MemberSevice{
	private Member[] memberList = new Member[10];
	
	@Override
	public void register(String id, String password, String name) {
		Member member = findById(id);
		if(member != null) {
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
	public boolean login(String id, String password) {
		Member member = findById(id);
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

	@Override
	public void logout(String id) {
		Member member = findById(id);
		if (member != null)
			System.out.println(member.getName() + "님 로그아웃 되었습니다.");
		System.out.println("로그아웃 완료");
	}		

	
}
