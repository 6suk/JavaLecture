package ch11.sec03_object;

public class Member {
	public String id;
	public String name;

	public Member() {
	}

	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj; // 맴버 타입으로 변경
			if (id.equals(member.id) && name.equals(member.name)) {
				return true;
			}
		}
		return false;
	}
	
	

	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}



//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member taget) {
//			if(id.equals(taget.id))
//				return true;
//		}
//		return false;
//	}

}
