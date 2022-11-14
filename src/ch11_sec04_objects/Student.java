package ch11_sec04_objects;

import java.util.Objects;

public class Student {
	int sno;
	String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
//		return Objects.hash(sno);
		return Objects.hash(name, sno);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(name, other.name) && sno == other.sno;
//	}
//	
	
	
}
