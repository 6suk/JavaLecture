package ch14_lambda.self;

public class Ex01_Main {

	// 함수 입력
	public static void main(String[] args) {
		action((x, y) -> {
			int result = x + y;
			System.out.println("result : " + result);
		});
		
		action((x, y) -> {
			int result = x - y;
			System.out.println("result : " + result);
		});

	}

	// 제공된 람다식을 이용, 내부 데이터를 처리하는 처리부 역할
	public static void action(Ex01_Calculable calculable) {
		// 데이터
		int x = 10, y = 4;
		// 데이터 처리
		calculable.calculate(x, y);
	}

}
