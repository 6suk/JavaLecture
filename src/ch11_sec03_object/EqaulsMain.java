package ch11_sec03_object;

public class EqaulsMain {

	public static void main(String[] args) {
		Member member1 = new Member("hong", "홍길동");
		Member member2 = new Member("hong", "홍자바");
		Member member3 = new Member("hong", "홍길동");
		
		//Member에서 eqauls method를 재정의하기 전
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		
		System.out.println(member1.toString());
		System.out.println(member2.toString());	// to String method 오버라이드 후
	}

}
