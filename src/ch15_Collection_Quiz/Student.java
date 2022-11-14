package ch15_Collection_Quiz;

public class Student {
	public int stuNum;
	public String name;

	public Student(int stuNum, String name) {
		super();
		this.stuNum = stuNum;
		this.name = name;
	}

	/** 답 코드 작성 */

	@Override
	public int hashCode() {
		return this.stuNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student stu = (Student) obj;
			return stu.stuNum == stuNum;
		}
		return false;
	}

}
