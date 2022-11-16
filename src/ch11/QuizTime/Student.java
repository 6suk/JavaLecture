package ch11.QuizTime;

public class Student {
	private String stuNum;
	
	public Student(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getStuNum() {
		return stuNum;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(stuNum);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student student = (Student)obj;
			return stuNum.equals(student.getStuNum());
		}
		return false;
	}
}
