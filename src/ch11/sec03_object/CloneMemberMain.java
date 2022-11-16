package ch11.sec03_object;

public class CloneMemberMain {
	public static void main(String[]args) {
	//원본 객체 생성
	CloneMember ori = new CloneMember("ko", "고예림", "123456");
	
	
	//복제 객체를 얻은 후 패스워드 변경
	CloneMember copy = ori.getMember();
	copy.pw = "456789";
	
	System.out.println(ori.toString());
	System.out.println(copy.toString());
	
	System.out.println(ori.hashCode());
	System.out.println(copy.hashCode());
	
	}
}
