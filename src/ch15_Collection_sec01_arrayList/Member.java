package ch15_Collection_sec01_arrayList;

public class Member{
	public String name;
	public int age;

	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return name.hashCode() + age;
		// name과 age값이 같으면 동일한 hashCode가 리턴됨
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			/**이름과 나이가 같으면 동일한 객체이다.*/
			Member member = (Member) obj;
			return name.equals(member.name) && (age == member.age);
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}

	
	

}
