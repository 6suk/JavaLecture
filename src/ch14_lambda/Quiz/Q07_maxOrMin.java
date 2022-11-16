package ch14_lambda.Quiz;

public class Q07_maxOrMin {

	// Operator 인터페이스 익명 구현 객체
	@FunctionalInterface
	public static interface Operator {
		public int apply(int x, int y);
	}

	// 데이터
	private static int[] scores = { 10, 50, 3 };

	// 데이터 처리부
	public static int maxOrMin(Operator operator) {
		int result = scores[0];
		for (int score : scores)
			result = operator.apply(result, score);
		return result;
	}

	public static void main(String[] args) {
		// 최대값 얻기
		int max = maxOrMin((x, y) -> x = x > y ? x : y);
		System.out.println("최대값 : " + max);
		
		// 최소값 얻기
		int min = maxOrMin((x, y) -> x = x < y ? x : y);
		System.out.println("최소값 : " + min);
	}

}
