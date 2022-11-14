package ch15_Collection_Quiz;

public class Q10_Student implements Comparable<Q10_Student>{
	public String id;
	public int score;
	
	public Q10_Student(String id, int score) {
		super();
		this.id = id;
		this.score = score;
	}

	/** 답 코드 작성 */
	@Override
	public int compareTo(Q10_Student o) {
		return score - o.score;
	}

}
