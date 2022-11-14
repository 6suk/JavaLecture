package ch13_generic.sec01_non_generic;

public class Main {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); // 자동 타입 변환
//		String name = (String)box.get();	// 강제 타입 변환
		String name = null;
		if (box.get() instanceof String) {
			name = (String) box.get();
		}

		box.set(new Apple());
		Apple apple = (Apple) box.get();

		System.out.println(name);
		System.out.println(apple);

	}

}
