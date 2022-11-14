package ch17_Stream;

public class Ex08_Student implements Comparable<Ex08_Student>{
	private String name;
	private int score;

	public Ex08_Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int compareTo(Ex08_Student o) {
		return Integer.compare(score, o.score);
	}
	
	

}
