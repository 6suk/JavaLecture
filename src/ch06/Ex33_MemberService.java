package ch06;

public class Ex33_MemberService {
	
	private String id;
	private String password;
	private String name;
	
	Ex33_MemberService(){
		
	}
	
	Ex33_MemberService(String id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			this.id = id;
			return true;
		}
		this.id = id;
		return false;
	}
	
	void register(String id, String password, String name) {
		this.id = id;
		this.password = password;
		this.name = name;
	}
	
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
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


	
	
	

}
