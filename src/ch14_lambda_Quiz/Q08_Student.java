package ch14_lambda_Quiz;

public class Q08_Student {
	
	// Function<T> 인터페이스 익명 구현 객체
	@FunctionalInterface
	public interface Function<T> {
		public double apply(T t);
	}
	
	// student 필드
	private String name;
	private int engScore;
	private int mathScore;
	
	// student 생성자
	public Q08_Student(String name, int engScore, int mathScore) {
		super();
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	// getter
	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}

	public int getMathScore() {
		return mathScore;
	}
	
}
