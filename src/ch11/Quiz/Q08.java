package ch11.Quiz;

public class Q08 {

	public static void main(String[] args) {
		int[] scores = new int[1000];
		
		long a = System.nanoTime();
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		
		double avg = sum / scores.length;
		long b = System.nanoTime();
		
		System.out.println(avg);
		System.out.println((b-a)+" ns");
		
	}

}
