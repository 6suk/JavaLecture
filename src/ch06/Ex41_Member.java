package ch06;

public class Ex41_Member {
	private String id;
	private String password;
	private String name;

	public Ex41_Member() {
	}

	Ex41_Member(String id, String password, String name) {	
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}

	
	
	
	
	String getId() {
		return id;
	}

	void setId(String id) {
		this.id = id;
	}

	String getPassword() {
		return password;
	}

	void setPassword(String password) {
		this.password = password;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Ex34_Member [id=" + id + ", password=" + password + ", name=" + name + "]";
	}

}
