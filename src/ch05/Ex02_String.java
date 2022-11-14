package ch05;

public class Ex02_String {

	public static void main(String[] args) {
		String s1 = "홍길동";
		String s2 = "홍길동";
		System.out.println(s1 == s2); // true, 동일한 기억 장소
		
		String s3 = new String("홍길동");	//생성자, 보통 이렇게 쓰인다.
		String s4 = new String("홍길동");
		System.out.println(s3 == s4); // false, 각각 다른 기억 장소이기 때문에
		System.out.println(s3.equals(s4));
		System.out.println(s1.equals(s4));
		
	}

}
