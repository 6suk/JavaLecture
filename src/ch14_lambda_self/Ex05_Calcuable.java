package ch14_lambda_self;

public interface Ex05_Calcuable {
	public static interface Calcuable {
		double calc(double x, double y);
	}

	public static void action(Calcuable calcuable) {
		double result = calcuable.calc(10, 4);
		System.out.println("결과 : " + result);
	}

	public static void main(String[] args) {
		// 실행문이 두 개 이상일 경우
		action((x, y) -> {
			double result = x + y;
			return result;
		});

		// 리턴문이 하나만 있을 경우
		action((x, y) -> (x + y));

		// 리턴문이 하나만 있을 경우(메소드 호출)
		action((x, y) -> sum(x, y));

	}

	public static double sum(double x, double y) {
		return (x + y);
	}

}
