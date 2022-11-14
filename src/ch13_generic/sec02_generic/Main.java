package ch13_generic.sec02_generic;

public class Main {

	public static void main(String[] args) {
		Box<String> box1 = new Box<>();
		box1.set("홍길동");
		String name = box1.get();	// 강제 변환 타입을 하지 않아도 된다.
		System.out.println(name);
		
		Box<Integer> box2 = new Box<>();
		box2.set(22);
		int age = box2.get();
		System.out.println(age);
	}
}

