package ch14_lambda_self;

public class Ex04_Person {
	
	// 데이터 처리부
	public static void action1(Ex04_Workable workable) {
		workable.work("홍길동", "프로그래밍");
	}
	public static void action2(Ex04_Speakable speakable) {
		speakable.speak("안녕하세요");
	}
	
	public static void main(String[] args) {
		action1((name, job) ->{
			System.out.print(name + "이 ");
			System.out.println(job + "을 합니다.");
		});
		
		action2(word ->{
			System.out.print("\"" + word + "\"");
			System.out.println("라고 말합니다.");
		});
		action2(word -> System.out.println("\"" + word + "\"라고 외칩니다."));
	}
	
}
