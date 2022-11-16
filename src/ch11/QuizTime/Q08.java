package ch11.QuizTime;

public class Q08 {

	public static void main(String[] args) {
		
		long a = System.nanoTime();	// 시작시간
		
		int[] scores = new int[1000];
		for (int i = 0; i < scores.length; i++) {
			scores[i] = i;
		}
		
		int sum = 0;
		for (int i : scores) {
			sum += i;
		}
		
		double avg = (double)sum / scores.length;
		System.out.println(avg);
		
		long b = System.nanoTime();	// 끝난시간
		System.out.println(b-a);
	}
}
