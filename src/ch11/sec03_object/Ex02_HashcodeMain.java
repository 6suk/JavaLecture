package ch11.sec03_object;

import java.util.HashMap;

public class Ex02_HashcodeMain {

	public static void main(String[] args) {
		// Key 객체 식별키로 사용해서 String 값을 저장하는 HashMap 객체를 생성
		HashMap<Key, String> hashMap = new HashMap<>();
		
//		hashMap.put(new Key(1), "홍길동");
//		hashMap.put(new Key(2), "이순신");
		
		// Key class 에서 hashcode 메소드를 오버라이드 하기 이전
		System.out.println(new Key(1).hashCode() + ","+ new Key(1).hashCode()); //1684890795,94264799
		System.out.println(new Key(1).hashCode() + ","+ new Key(1).hashCode()); //1684890795,94264799
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		System.out.println(hashMap.get(new Key(2)));
		
		// Key class 에서 hashCode 메소드를 오버라이드 한 후

		
		
		
	}

}
