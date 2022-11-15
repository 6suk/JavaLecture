package ch18_IOStream.object;

import java.io.Serializable;

public class Member implements Serializable{
	
	private static final long serialVersionUID = 7176644582798302939L;
	private String id;
	private String name;
	public Member(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
