package ch11.QuizTime;

public class Q6_Member {
	private String id;
	private String name;

	public Q6_Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return id + ": " + name;
	}

	public static void main(String[] args) {
		Q6_Member member = new Q6_Member ("blue", "이파란");
		System.out.println(member);
	}

}
