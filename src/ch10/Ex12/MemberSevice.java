package ch10.Ex12;


public interface MemberSevice {
	void register(String id, String password, String name);
	void printAllMembers();
	Member findById(String id);
	boolean login(String id, String password);
	void logout(String id);
}
