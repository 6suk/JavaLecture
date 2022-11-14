package ch11_Quiz;

public class Q05_Student {
	private String stuNum;

	public Q05_Student(String stuNum) {
		super();
		this.stuNum = stuNum;
	}

	public String getStuNum() {
		return stuNum;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Q05_Student) {
			Q05_Student stu = (Q05_Student) obj;
			return stuNum.equals(stu.getStuNum());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return stuNum.hashCode();
	}

}
