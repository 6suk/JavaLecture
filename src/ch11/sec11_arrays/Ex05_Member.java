package ch11.sec11_arrays;

public class Ex05_Member {
	int id;
	String name;
	
	
	public Ex05_Member() {
		super();
	}
	
	
	public Ex05_Member(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Ex05_Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
